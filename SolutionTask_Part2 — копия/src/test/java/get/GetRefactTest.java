package get;

import api.api_models.JsonPlaceHolder_Model;
import base.BaseTest;
import io.restassured.http.Method;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static constans.JsonPlaceHolder_Constans.POST_ID;

public class GetRefactTest extends BaseTest {
    @Test(description = "/comments?postId=<>",dataProvider = "searchByUserIdDataRefact")
    public void getByUserId(int postId){
        JsonPlaceHolder_Model.RequestModel requestModel = JsonPlaceHolder_Model.RequestModel.builder()
                .postId(postId)
                .build();
        apiManager.getJsonPlaceHolderModel().searchByUserId(requestModel, Method.GET,200);
    }

//    @DataProvider
//    public Object[] searchByUserIdData(){
//        return new Object[]{
//                1
//        };
//    }

    @DataProvider
    public Object[] searchByUserIdDataRefact(){
        return new Object[]{
                Integer.parseInt(POST_ID.trim())
        };
    }

}
