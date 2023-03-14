package ch11;

public class Radio implements Sound {
    private int soundLevel;
    @Override
    public void soundUp() {
        soundLevel++;
    }

    @Override
    public void soundDown() {
        if(soundLevel == 0){
            return;
        }
        soundLevel--;
    }
}
