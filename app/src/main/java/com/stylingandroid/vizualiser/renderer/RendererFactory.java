package com.stylingandroid.vizualiser.renderer;

import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.ColorInt;

public class RendererFactory {
    public WaveformRenderer createSimpleWaveformRenderer(@ColorInt int foreground, @ColorInt int background) {
        Paint paint = new Paint();
        paint.setColor(foreground);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        Path waveformPath = new Path();

        return new SimpleWaveformRenderer(background,paint, waveformPath);
    }
}
