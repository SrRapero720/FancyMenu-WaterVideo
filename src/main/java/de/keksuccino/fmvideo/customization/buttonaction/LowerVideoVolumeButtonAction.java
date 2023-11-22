package de.keksuccino.fmvideo.customization.buttonaction;

import de.keksuccino.fancymenu.api.buttonaction.ButtonActionContainer;
import de.keksuccino.fmvideo.FmVideo;
import de.keksuccino.fmvideo.video.VideoVolumeHandler;
import de.keksuccino.konkrete.localization.Locals;
import de.keksuccino.konkrete.math.MathUtils;

public class LowerVideoVolumeButtonAction extends ButtonActionContainer {

    public LowerVideoVolumeButtonAction() {
        super(FmVideo.ID + ":video_buttonaction:lower_volume");
    }

    @Override
    public String getAction() {
        return "lower_video_volume";
    }

    @Override
    public boolean hasValue() {
        return true;
    }

    @Override
    public void execute(String value) {

        if (value != null) {
            if (MathUtils.isInteger(value)) {

                int newVol = VideoVolumeHandler.getVolume() - Integer.parseInt(value);
                VideoVolumeHandler.setVolume(newVol);

            }
        }

    }

    @Override
    public String getActionDescription() {
        return Locals.localize("fancymenu.fmvideo.buttonaction.lowervolume.action.desc");
    }

    @Override
    public String getValueDescription() {
        return Locals.localize("fancymenu.fmvideo.buttonaction.lowervolume.value.desc");
    }

    @Override
    public String getValueExample() {
        return "10";
    }

}