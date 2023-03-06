public class Radio {

    private int currentStation;
    private int currentVolume;




    public void  next() {
        if (currentStation!=9) {
            currentStation++;
            return;
        }
        currentStation=0;
    }
    public void prev() {
        if(currentStation !=0){
            currentStation--;
            return;
        }
        currentStation=9;
    }

    public  int getCurrentStation(){
        return  currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation <0){
            return;
        }
        if (currentStation>9){
            return;
        }
        this.currentStation = currentStation;
    }
}
