package androidx.camera.core;

import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes23.dex */
public interface ImageProcessor {

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface OutputFormats {
    }

    public interface Request {
        ImageProxy getInputImage();

        int getOutputFormat();
    }

    public interface Response {
        ImageProxy getOutputImage();
    }

    Response process(Request request) throws ProcessingException;
}
