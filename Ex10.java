public class Ex10 {
    private int canal;
    private int volume;

    public Ex10() {
        canal = 1;
        volume = 10;
    }

    public void setCanal(int canal) {
        if (canal >= 1 && canal <= 99) {
            this.canal = canal;
        }
    }

    public int getCanal() {
        return canal;
    }

    public void aumentarVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    public int getVolume() {
        return volume;
    }
}
