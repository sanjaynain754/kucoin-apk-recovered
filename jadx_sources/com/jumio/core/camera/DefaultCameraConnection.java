package com.jumio.core.camera;

import android.annotation.SuppressLint;
import android.media.ImageReader;
import com.jumio.core.camera.DefaultCameraConnection;
import jumio.core.AbstractC40664g1;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0017¨\u0006\u0006"}, m90084d2 = {"Lcom/jumio/core/camera/DefaultCameraConnection;", "Lcom/jumio/core/camera/CameraConnectionInterface;", "<init>", "()V", "get", "Lcom/jumio/core/camera/CameraConnectionData;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DefaultCameraConnection implements CameraConnectionInterface {
    /* JADX INFO: renamed from: a */
    public static final boolean m14505a(StackTraceElement it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String className = it.getClassName();
        Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
        if (StringsKt.startsWith$default(className, "com.jumio", false, 2, (Object) null)) {
            return true;
        }
        String className2 = it.getClassName();
        Intrinsics.checkNotNullExpressionValue(className2, "getClassName(...)");
        return StringsKt.startsWith$default(className2, "jumio.", false, 2, (Object) null);
    }

    @Override // com.jumio.core.camera.CameraConnectionInterface
    @SuppressLint({"MissingPermission"})
    @NotNull
    public CameraConnectionData get() {
        try {
            ImageReader.newInstance(1, 1, 17, 1);
            return new CameraConnectionData(new String[0]);
        } catch (Exception e11) {
            return new CameraConnectionData(AbstractC40664g1.m89254a(e11, new Function1() { // from class: j9.b
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(DefaultCameraConnection.m14505a((StackTraceElement) obj));
                }
            }));
        }
    }
}
