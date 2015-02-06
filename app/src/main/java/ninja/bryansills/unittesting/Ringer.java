package ninja.bryansills.unittesting;

import android.media.AudioManager;

/**
 * Created by bsills on 2/5/15.
 */
public class Ringer {
    public void maximizeVolume(AudioManager audioManager) {
        if (audioManager.getRingerMode() != AudioManager.RINGER_MODE_SILENT) {
            int max = audioManager.getStreamMaxVolume(AudioManager.STREAM_RING);
            audioManager.setStreamVolume(AudioManager.STREAM_RING, max, 0);
        }
    }
}
