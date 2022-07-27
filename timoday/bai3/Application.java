package timoday.bai3;

import timoday.bai3.service.DocManagement;

public class Application {
    public static void main(String[] args) {
        DocManagement docManagement = new DocManagement();
        docManagement.findByDocumentCode("5");
    }
}
