package com.jumio.sdk.views;

import android.os.ParcelFileDescriptor;
import androidx.media3.exoplayer.offline.DownloadService;
import com.jumio.core.C9301R;
import com.jumio.core.scanpart.ScanPart;
import com.jumio.sdk.enums.JumioScanStep;
import com.jumio.sdk.retry.JumioRetryReason;
import com.jumio.sdk.scanpart.JumioScanPart;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import jumio.core.AbstractC40653e0;
import jumio.core.C40709p1;
import jumio.core.InterfaceC40694m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.p407io.CloseableKt;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0017"}, m90084d2 = {"Lcom/jumio/sdk/views/JumioFileAttacher;", "", "<init>", "()V", "fileAttacherInterface", "Lcom/jumio/core/interfaces/FileAttacherInterface;", DownloadService.KEY_REQUIREMENTS, "Lcom/jumio/sdk/views/JumioFileAttacher$JumioFileRequirements;", "getRequirements", "()Lcom/jumio/sdk/views/JumioFileAttacher$JumioFileRequirements;", "attach", "", "scanPart", "Lcom/jumio/sdk/scanpart/JumioScanPart;", "setFile", "file", "Ljava/io/File;", "(Ljava/io/File;)Lkotlin/Unit;", "setFileDescriptor", "fileDescriptor", "Landroid/os/ParcelFileDescriptor;", "(Landroid/os/ParcelFileDescriptor;)Lkotlin/Unit;", "JumioFileRequirements", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class JumioFileAttacher {

    /* JADX INFO: renamed from: a */
    public InterfaceC40694m1 f14754a;

    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m90084d2 = {"Lcom/jumio/sdk/views/JumioFileAttacher$JumioFileRequirements;", "", "mimeTypes", "", "", "maxFileSize", "", "pdfMaxPages", "url", "<init>", "(Ljava/util/List;IILjava/lang/String;)V", "getMimeTypes", "()Ljava/util/List;", "getMaxFileSize", "()I", "getPdfMaxPages", "getUrl", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class JumioFileRequirements {

        /* JADX INFO: renamed from: a */
        public final List f14755a;

        /* JADX INFO: renamed from: b */
        public final int f14756b;

        /* JADX INFO: renamed from: c */
        public final int f14757c;

        /* JADX INFO: renamed from: d */
        public final String f14758d;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof JumioFileRequirements)) {
                return false;
            }
            JumioFileRequirements jumioFileRequirements = (JumioFileRequirements) other;
            return Intrinsics.areEqual(this.f14755a, jumioFileRequirements.f14755a) && this.f14756b == jumioFileRequirements.f14756b && this.f14757c == jumioFileRequirements.f14757c && Intrinsics.areEqual(this.f14758d, jumioFileRequirements.f14758d);
        }

        public JumioFileRequirements(@NotNull List<String> mimeTypes, int i11, int i12, @Nullable String str) {
            Intrinsics.checkNotNullParameter(mimeTypes, "mimeTypes");
            this.f14755a = mimeTypes;
            this.f14756b = i11;
            this.f14757c = i12;
            this.f14758d = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ JumioFileRequirements copy$default(JumioFileRequirements jumioFileRequirements, List list, int i11, int i12, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                list = jumioFileRequirements.f14755a;
            }
            if ((i13 & 2) != 0) {
                i11 = jumioFileRequirements.f14756b;
            }
            if ((i13 & 4) != 0) {
                i12 = jumioFileRequirements.f14757c;
            }
            if ((i13 & 8) != 0) {
                str = jumioFileRequirements.f14758d;
            }
            return jumioFileRequirements.copy(list, i11, i12, str);
        }

        @NotNull
        public final List<String> component1() {
            return this.f14755a;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getF14756b() {
            return this.f14756b;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getF14757c() {
            return this.f14757c;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getF14758d() {
            return this.f14758d;
        }

        @NotNull
        public final JumioFileRequirements copy(@NotNull List<String> mimeTypes, int maxFileSize, int pdfMaxPages, @Nullable String url) {
            Intrinsics.checkNotNullParameter(mimeTypes, "mimeTypes");
            return new JumioFileRequirements(mimeTypes, maxFileSize, pdfMaxPages, url);
        }

        public final int getMaxFileSize() {
            return this.f14756b;
        }

        @NotNull
        public final List<String> getMimeTypes() {
            return this.f14755a;
        }

        public final int getPdfMaxPages() {
            return this.f14757c;
        }

        @Nullable
        public final String getUrl() {
            return this.f14758d;
        }

        public int hashCode() {
            int iM89252a = AbstractC40653e0.m89252a(this.f14757c, AbstractC40653e0.m89252a(this.f14756b, this.f14755a.hashCode() * 31, 31), 31);
            String str = this.f14758d;
            return iM89252a + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return "JumioFileRequirements(mimeTypes=" + this.f14755a + ", maxFileSize=" + this.f14756b + ", pdfMaxPages=" + this.f14757c + ", url=" + this.f14758d + ')';
        }
    }

    public final void attach(@NotNull JumioScanPart scanPart) {
        Intrinsics.checkNotNullParameter(scanPart, "scanPart");
        if (scanPart.getScanPart$jumio_core_release() instanceof InterfaceC40694m1) {
            this.f14754a = (InterfaceC40694m1) scanPart.getScanPart$jumio_core_release();
        }
    }

    @NotNull
    public final JumioFileRequirements getRequirements() {
        JumioFileRequirements jumioFileRequirements;
        InterfaceC40694m1 interfaceC40694m1 = this.f14754a;
        return (interfaceC40694m1 == null || (jumioFileRequirements = ((C40709p1) interfaceC40694m1).f90353o) == null) ? new JumioFileRequirements(CollectionsKt.emptyList(), 0, 0, null) : jumioFileRequirements;
    }

    @Nullable
    public final Unit setFile(@NotNull File file) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(file, "file");
        InterfaceC40694m1 interfaceC40694m1 = this.f14754a;
        if (interfaceC40694m1 == null) {
            return null;
        }
        C40709p1 c40709p1 = (C40709p1) interfaceC40694m1;
        Intrinsics.checkNotNullParameter(file, "file");
        if (file.exists() && file.isFile() && file.canRead()) {
            ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(file, 268435456);
            try {
                Intrinsics.checkNotNull(parcelFileDescriptorOpen);
                c40709p1.m89263a(parcelFileDescriptorOpen);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(parcelFileDescriptorOpen, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(parcelFileDescriptorOpen, th2);
                    throw th3;
                }
            }
        } else {
            JumioScanStep jumioScanStep = JumioScanStep.RETRY;
            String string = c40709p1.getF14541a().getF13601b().getString(C9301R.string.jumio_dv_retry_selected_file_cannot_be_processed);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            ScanPart.sendScanStep$default(c40709p1, jumioScanStep, new JumioRetryReason(401, string), null, 4, null);
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final Unit setFileDescriptor(@NotNull ParcelFileDescriptor fileDescriptor) {
        Intrinsics.checkNotNullParameter(fileDescriptor, "fileDescriptor");
        InterfaceC40694m1 interfaceC40694m1 = this.f14754a;
        if (interfaceC40694m1 == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(fileDescriptor, "fileDescriptor");
        ((C40709p1) interfaceC40694m1).m89263a(fileDescriptor);
        return Unit.INSTANCE;
    }
}
