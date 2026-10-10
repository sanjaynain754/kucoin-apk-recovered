package com.jumio.core.scanpart;

import android.os.ParcelFileDescriptor;
import jumio.core.C40592S1;
import jumio.core.EnumC40587R1;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\n"}, m90084d2 = {"Lcom/jumio/core/scanpart/ImageUploadFile$Companion;", "", "<init>", "()V", "createJPEG", "Lcom/jumio/core/scanpart/ImageUploadFile;", "fileDescriptor", "Landroid/os/ParcelFileDescriptor;", "createPNG", "createWEBP", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ImageUploadFile$Companion {
    @NotNull
    public final C40592S1 createJPEG(@NotNull ParcelFileDescriptor fileDescriptor) {
        Intrinsics.checkNotNullParameter(fileDescriptor, "fileDescriptor");
        return new C40592S1(fileDescriptor, EnumC40587R1.JPEG);
    }

    @NotNull
    public final C40592S1 createPNG(@NotNull ParcelFileDescriptor fileDescriptor) {
        Intrinsics.checkNotNullParameter(fileDescriptor, "fileDescriptor");
        return new C40592S1(fileDescriptor, EnumC40587R1.PNG);
    }

    @NotNull
    public final C40592S1 createWEBP(@NotNull ParcelFileDescriptor fileDescriptor) {
        Intrinsics.checkNotNullParameter(fileDescriptor, "fileDescriptor");
        return new C40592S1(fileDescriptor, EnumC40587R1.WEBP);
    }

    public ImageUploadFile$Companion(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
