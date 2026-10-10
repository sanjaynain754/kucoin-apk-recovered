package com.facebook.imagepipeline.decoder;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p749x5.C46075i;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DecodeException.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0006\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB%\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lcom/facebook/imagepipeline/decoder/DecodeException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "message", "Lx5/i;", "encodedImage", "<init>", "(Ljava/lang/String;Lx5/i;)V", "", "t", "(Ljava/lang/String;Ljava/lang/Throwable;Lx5/i;)V", "Lx5/i;", "getEncodedImage", "()Lx5/i;", "imagepipeline_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class DecodeException extends RuntimeException {

    @NotNull
    private final C46075i encodedImage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DecodeException(@Nullable String str, @NotNull C46075i encodedImage) {
        super(str);
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        this.encodedImage = encodedImage;
    }

    @NotNull
    public final C46075i getEncodedImage() {
        return this.encodedImage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DecodeException(@Nullable String str, @Nullable Throwable th2, @NotNull C46075i encodedImage) {
        super(str, th2);
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        this.encodedImage = encodedImage;
    }
}
