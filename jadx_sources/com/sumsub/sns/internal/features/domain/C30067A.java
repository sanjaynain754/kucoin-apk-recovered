package com.sumsub.sns.internal.features.domain;

import androidx.exifinterface.media.ExifInterface;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.log.LoggerType;
import com.tencent.rtmp.downloader.TXVodDownloadDataSource;
import java.io.File;
import p852kotlin.collections.ArraysKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.A */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30067A {
    /* JADX INFO: renamed from: a */
    public final void m70094a(int i11, File file) {
        int i12;
        int i13 = i11 % TXVodDownloadDataSource.QUALITY_360P;
        if (i13 == 0) {
            return;
        }
        C33272c.f67816e.f67810a.mo68955d("DocCapture", "applyRotation: " + file.getName() + " -> " + i11, null);
        if (i13 <= 0) {
            i13 += TXVodDownloadDataSource.QUALITY_360P;
        }
        try {
            ExifInterface exifInterface = new ExifInterface(file);
            int rotationDegrees = exifInterface.getRotationDegrees() + i13;
            if (rotationDegrees == 90) {
                i12 = 6;
            } else if (rotationDegrees != 180) {
                i12 = rotationDegrees != 270 ? 1 : 8;
            } else {
                i12 = 3;
            }
            exifInterface.setAttribute(ExifInterface.TAG_ORIENTATION, String.valueOf(i12));
            exifInterface.saveAttributes();
        } catch (Exception e11) {
            C33272c c33272c = C33272c.f67812a;
            C33272c.m71618b(ArraysKt.toList(new LoggerType[]{LoggerType.KIBANA})).mo68956e(AbstractC33294e.m71624a(this), "Can't apply rotation", e11);
        }
    }
}
