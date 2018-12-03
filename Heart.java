package th2allotherclasses;

/**
 *
 * @author emanuela
 */
public class Heart {

    int bpm;
    HeartBeat heartBeat;

    public Heart(int bpm, HeartBeat heartBeat) {
        this.bpm = bpm;
        this.heartBeat = heartBeat;
    }

    public int getBpm() {
        return bpm;
    }

    public void setBpm(int bpm) {
        this.bpm = bpm;
    }

    public void oneMinute() {
        for (int i = 0; i <= this.bpm; i++) {
            System.out.print(this.heartBeat + " ");
        }
    }
}
