package com.jumio.core.interfaces;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import com.jumio.core.constants.ConstantsKt;
import com.jumio.core.scanpart.ImageUploadFile$Companion;
import com.jumio.core.util.ByteArrayUtilKt;
import java.io.IOException;
import jumio.core.C40539H2;
import jumio.core.C40592S1;
import jumio.core.InterfaceC40614W3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/jumio/core/interfaces/UploadFileInterface$Companion;", "", "<init>", "()V", "createFromFile", "Lcom/jumio/core/interfaces/UploadFileInterface;", "fileDescriptor", "Landroid/os/ParcelFileDescriptor;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class UploadFileInterface$Companion {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ UploadFileInterface$Companion f14160a = new UploadFileInterface$Companion();

    @Nullable
    public final InterfaceC40614W3 createFromFile(@NotNull ParcelFileDescriptor fileDescriptor) throws IOException, ErrnoException {
        Intrinsics.checkNotNullParameter(fileDescriptor, "fileDescriptor");
        byte[] bArr = new byte[16];
        Os.pread(fileDescriptor.getFileDescriptor(), bArr, 0, 16, 0L);
        if (ByteArrayUtilKt.startsWith(bArr, ConstantsKt.getPDF_SIGNATURE())) {
            ParcelFileDescriptor parcelFileDescriptorDup = fileDescriptor.dup();
            Intrinsics.checkNotNullExpressionValue(parcelFileDescriptorDup, "dup(...)");
            return new C40539H2(parcelFileDescriptorDup);
        }
        if (ByteArrayUtilKt.startsWith(bArr, ConstantsKt.getJPEG_SIGNATURE())) {
            ImageUploadFile$Companion imageUploadFile$Companion = C40592S1.f90115e;
            ParcelFileDescriptor parcelFileDescriptorDup2 = fileDescriptor.dup();
            Intrinsics.checkNotNullExpressionValue(parcelFileDescriptorDup2, "dup(...)");
            return imageUploadFile$Companion.createJPEG(parcelFileDescriptorDup2);
        }
        if (ByteArrayUtilKt.startsWith(bArr, ConstantsKt.getPNG_SIGNATURE())) {
            ImageUploadFile$Companion imageUploadFile$Companion2 = C40592S1.f90115e;
            ParcelFileDescriptor parcelFileDescriptorDup3 = fileDescriptor.dup();
            Intrinsics.checkNotNullExpressionValue(parcelFileDescriptorDup3, "dup(...)");
            return imageUploadFile$Companion2.createPNG(parcelFileDescriptorDup3);
        }
        if (!ByteArrayUtilKt.startsWith(bArr, ConstantsKt.getWEBP_SIGNATURE())) {
            return null;
        }
        ImageUploadFile$Companion imageUploadFile$Companion3 = C40592S1.f90115e;
        ParcelFileDescriptor parcelFileDescriptorDup4 = fileDescriptor.dup();
        Intrinsics.checkNotNullExpressionValue(parcelFileDescriptorDup4, "dup(...)");
        return imageUploadFile$Companion3.createWEBP(parcelFileDescriptorDup4);
    }
}
