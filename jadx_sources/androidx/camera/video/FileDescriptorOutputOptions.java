package androidx.camera.video;

import android.location.Location;
import android.os.ParcelFileDescriptor;
import androidx.annotation.IntRange;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes23.dex */
public final class FileDescriptorOutputOptions extends OutputOptions {
    private final FileDescriptorOutputOptionsInternal mFileDescriptorOutputOptionsInternal;

    public static final class Builder extends OutputOptions.Builder<FileDescriptorOutputOptions, Builder> {
        private final FileDescriptorOutputOptionsInternal.Builder mInternalBuilder;

        public Builder(ParcelFileDescriptor parcelFileDescriptor) {
            super(new C1254x39d81fa5.Builder());
            Preconditions.checkNotNull(parcelFileDescriptor, "File descriptor can't be null.");
            FileDescriptorOutputOptionsInternal.Builder builder = (FileDescriptorOutputOptionsInternal.Builder) this.mRootInternalBuilder;
            this.mInternalBuilder = builder;
            builder.setParcelFileDescriptor(parcelFileDescriptor);
        }

        @Override // androidx.camera.video.OutputOptions.Builder
        public FileDescriptorOutputOptions build() {
            return new FileDescriptorOutputOptions(this.mInternalBuilder.build());
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.camera.video.FileDescriptorOutputOptions$Builder, java.lang.Object] */
        @Override // androidx.camera.video.OutputOptions.Builder
        public /* bridge */ /* synthetic */ Builder setDurationLimitMillis(@IntRange(from = 0) long j11) {
            return super.setDurationLimitMillis(j11);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.camera.video.FileDescriptorOutputOptions$Builder, java.lang.Object] */
        @Override // androidx.camera.video.OutputOptions.Builder
        public /* bridge */ /* synthetic */ Builder setFileSizeLimit(@IntRange(from = 0) long j11) {
            return super.setFileSizeLimit(j11);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.camera.video.FileDescriptorOutputOptions$Builder, java.lang.Object] */
        @Override // androidx.camera.video.OutputOptions.Builder
        public /* bridge */ /* synthetic */ Builder setLocation(Location location) {
            return super.setLocation(location);
        }
    }

    @AutoValue
    public static abstract class FileDescriptorOutputOptionsInternal extends OutputOptions.OutputOptionsInternal {

        @AutoValue.Builder
        public static abstract class Builder extends OutputOptions.OutputOptionsInternal.Builder<Builder> {
            @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
            public abstract FileDescriptorOutputOptionsInternal build();

            public abstract Builder setParcelFileDescriptor(ParcelFileDescriptor parcelFileDescriptor);
        }

        public abstract ParcelFileDescriptor getParcelFileDescriptor();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FileDescriptorOutputOptions) {
            return this.mFileDescriptorOutputOptionsInternal.equals(((FileDescriptorOutputOptions) obj).mFileDescriptorOutputOptionsInternal);
        }
        return false;
    }

    public ParcelFileDescriptor getParcelFileDescriptor() {
        return this.mFileDescriptorOutputOptionsInternal.getParcelFileDescriptor();
    }

    public int hashCode() {
        return this.mFileDescriptorOutputOptionsInternal.hashCode();
    }

    public String toString() {
        return this.mFileDescriptorOutputOptionsInternal.toString().replaceFirst("FileDescriptorOutputOptionsInternal", "FileDescriptorOutputOptions");
    }

    public FileDescriptorOutputOptions(FileDescriptorOutputOptionsInternal fileDescriptorOutputOptionsInternal) {
        super(fileDescriptorOutputOptionsInternal);
        this.mFileDescriptorOutputOptionsInternal = fileDescriptorOutputOptionsInternal;
    }
}
