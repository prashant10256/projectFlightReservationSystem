public class RegularTicket {
    boolean splService;

    public boolean isSplService() {
        return splService;
    }

    public void setSplService(boolean splService) {
        this.splService = splService;
    }

    private void splService(){
        splService = false;
        System.out.println("Special Service Available");
    }

    private void splServiceUpdate(){
        splService = true;
        System.out.println("Special Service Availed");
    }
}
