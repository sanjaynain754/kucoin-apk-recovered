package androidx.camera.video.internal.encoder;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes23.dex */
public interface EncoderFactory {
    Encoder createEncoder(Executor executor, EncoderConfig encoderConfig, int i11) throws InvalidConfigException;
}
