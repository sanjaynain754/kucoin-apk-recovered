package com.sumsub.sns.internal.p126ml.core;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.log.C33272c;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.sumsub.sns.internal.ml.core.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33321a extends AbstractC33324c {

    /* JADX INFO: renamed from: a */
    public final Context f67945a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C33321a) && Intrinsics.areEqual(this.f67945a, ((C33321a) obj).f67945a) && Intrinsics.areEqual("face_detection_short_range.tflite", "face_detection_short_range.tflite") && Intrinsics.areEqual("MlSolution.TfFaceDetection", "MlSolution.TfFaceDetection");
    }

    @Override // com.sumsub.sns.internal.p126ml.core.AbstractC33324c
    /* JADX INFO: renamed from: a */
    public final ByteBuffer mo71643a() throws IOException {
        C33272c.f67816e.f67810a.mo68955d("MlSolution.TfFaceDetection", "Loading MlModel face_detection_short_range.tflite from assets", null);
        AssetFileDescriptor assetFileDescriptorOpenFd = this.f67945a.getAssets().openFd("face_detection_short_range.tflite");
        return new FileInputStream(assetFileDescriptorOpenFd.getFileDescriptor()).getChannel().map(FileChannel.MapMode.READ_ONLY, assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getDeclaredLength());
    }

    public final int hashCode() {
        return (((this.f67945a.hashCode() * 31) + 682028400) * 31) + 201656736;
    }

    public C33321a(Context context) {
        this.f67945a = context;
    }

    public final String toString() {
        return AbstractC28458h.m69333a(this) + ": face_detection_short_range.tflite";
    }
}
