package testnet.btc_tests;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import testnet.TransactionType;
import testnet.btc.BtcTestnetClient;
import testnet.dto.ApiResponse;
import utils.ParserUtil;

import static org.apache.http.HttpStatus.SC_OK;

public class BtcTest {

    @Test
    public void validateThatBtcBalanceUpdatedCorrectly() {
        double sentAmount = 0.000001;
        BtcTestnetClient btcTestnetClient = new BtcTestnetClient();
        ApiResponse apiResponseBeforeUpdate = getAllTransactions();

        String receiverAddress = apiResponseBeforeUpdate.getData()
                .getTxs().get(0).getAmountsReceived().stream().filter(amount -> amount.getAmount() > 0).findFirst().get().getRecipient();

        //Get current amount on the chosen address
        double amountBeforeUpdate = apiResponseBeforeUpdate.getData().getTxs().get(0).getAmountsReceived().stream().filter(recip -> recip.getRecipient().equals(receiverAddress))
                .findFirst().get().getAmount();

        //Sent btc to the chosen address
        Response sendUserResp = btcTestnetClient.sendBtcTestNetCoins(receiverAddress, sentAmount);
//        Assert.assertEquals(sendUserResp.getStatusCode(), SC_OK);

        //Validate that the amount updated
        ApiResponse apiResponseAfterUpdate = getAllTransactions();

        double actualAmount = apiResponseAfterUpdate.getData().getTxs().get(0).getAmountsReceived().stream().filter(recip -> recip.getRecipient().equals(receiverAddress))
                .findFirst().get().getAmount();

        Assert.assertEquals(actualAmount + sentAmount, amountBeforeUpdate, "The amount wasnt updated");
    }

    @Test
    public void validateGenerationAddressWithValidLabel() {
        BtcTestnetClient btcTestnetClient = new BtcTestnetClient();
        Response response = btcTestnetClient.getNewAddress("useridXdonutsXdate");
        Assert.assertEquals(response.getStatusCode(), SC_OK);
        //Get all addresses
        //Validate that new created
        //Validate that the label is correct
    }

    public ApiResponse getAllTransactions() {
        BtcTestnetClient btcTestnetClient = new BtcTestnetClient();
        Response response = btcTestnetClient.getAllTransactionsInfo(TransactionType.RECEIVED);
        Assert.assertEquals(response.getStatusCode(), SC_OK);


        ApiResponse apiResponse = ParserUtil.parse(response, ApiResponse.class);
        return apiResponse;
    }
}
