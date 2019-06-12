package controllers.usermanagement;

import controllers.BaseController;
import java.util.concurrent.CompletionStage;
import play.mvc.Result;

/**
 * This controller is used to encrypt the user sensitive fields link email. CompletionStage: A stage
 * of a possibly asynchronous computation, that performs an action or computes a value when another
 * CompletionStage completes CompletableFuture: A Future that may be explicitly completed (setting
 * its value and status), and may be used as a CompletionStage, supporting dependent functions and
 * actions that trigger upon its completion.
 */
public class UserDataEncryptionController extends BaseController {

  /**
   * This method will encrypt user all PI/private data
   *
   * @return Return a CompletableFuture of success response
   */
  public CompletionStage<Result> encrypt() {
    startTrace("encrypt");
    CompletionStage<Result> response = handelRequest();
    endTrace("encrypt");
    return response;
  }

  /**
   * This method will decrypt user private data.
   *
   * @return Return a CompletableFuture of success response
   */
  public CompletionStage<Result> decrypt() {
    startTrace("decrypt");
    CompletionStage<Result> response = handelRequest();
    endTrace("decrypt");
    return response;
  }
}
