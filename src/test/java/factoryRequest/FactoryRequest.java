package factoryRequest;

public class FactoryRequest {
    public static IRequest make(String type){
        IRequest request;
        switch (type.toLowerCase()){
            case "get":
                request = new RequestGET();
                break;
            case "post":
                request = new RequestPost();
                break;
            case "put":
                request = new RequestPut();
                break;
            case "delete":
                request = new RequestDelete();
                break;
            default:
                try {
                    throw new Exception("Method not implemented");
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
        }
        return request;
    }
}
