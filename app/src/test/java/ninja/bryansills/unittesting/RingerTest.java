package ninja.bryansills.unittesting;

import android.media.AudioManager;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class RingerTest {
    Ringer ringer;

    @Before
    public void setUp()
    {
        ringer = new Ringer();
    }

    @Test
    public void testSilentRingerIsNotDisturbed() {
        // 1. Prepare mocks and script their behavior.
        AudioManager audioManager = Mockito.mock(AudioManager.class);
        Mockito.when(audioManager.getRingerMode())
                .thenReturn(AudioManager.RINGER_MODE_SILENT);

        // 2. Test the code of interest.
        ringer.maximizeVolume(audioManager);

        // 3. Validate that we saw exactly what we wanted.
        Mockito.verify(audioManager).getRingerMode();
        Mockito.verifyNoMoreInteractions(audioManager);
    }
}
