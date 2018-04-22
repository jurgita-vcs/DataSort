package acdlab.lt.dataSortApp.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import acdlab.lt.dataSortApp.client.DataSortAppService;

public class DataSortAppServiceImpl extends RemoteServiceServlet implements DataSortAppService {
    // Implementation of sample interface method
    public String getMessage(String msg) {
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
    }
}