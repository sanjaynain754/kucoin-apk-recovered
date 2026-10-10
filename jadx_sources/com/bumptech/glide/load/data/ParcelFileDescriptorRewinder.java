package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class ParcelFileDescriptorRewinder implements InterfaceC5324e<ParcelFileDescriptor> {

    /* JADX INFO: renamed from: a */
    public final InternalRewinder f6744a;

    /* JADX INFO: loaded from: classes34.dex */
    @RequiresApi(21)
    public static final class InternalRewinder {

        /* JADX INFO: renamed from: a */
        public final ParcelFileDescriptor f6745a;

        public ParcelFileDescriptor rewind() throws IOException {
            try {
                Os.lseek(this.f6745a.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return this.f6745a;
            } catch (ErrnoException e11) {
                throw new IOException(e11);
            }
        }

        public InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.f6745a = parcelFileDescriptor;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$a */
    @RequiresApi(21)
    public static final class C5319a implements InterfaceC5324e.a<ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.data.InterfaceC5324e.a
        @NonNull
        /* JADX INFO: renamed from: a */
        public Class<ParcelFileDescriptor> mo6663a() {
            return ParcelFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5324e.a
        @NonNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC5324e<ParcelFileDescriptor> mo6664b(@NonNull ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m6659c() {
        return true;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5324e
    @NonNull
    @RequiresApi(21)
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public ParcelFileDescriptor mo6660a() throws IOException {
        return this.f6744a.rewind();
    }

    @RequiresApi(21)
    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f6744a = new InternalRewinder(parcelFileDescriptor);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5324e
    /* JADX INFO: renamed from: b */
    public void mo6661b() {
    }
}
