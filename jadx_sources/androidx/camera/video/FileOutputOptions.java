package androidx.camera.video;

import android.location.Location;
import androidx.annotation.IntRange;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;
import java.io.File;

/* JADX INFO: loaded from: classes23.dex */
public final class FileOutputOptions extends OutputOptions {
    private final FileOutputOptionsInternal mFileOutputOptionsInternal;

    public static final class Builder extends OutputOptions.Builder<FileOutputOptions, Builder> {
        private final FileOutputOptionsInternal.Builder mInternalBuilder;

        public Builder(File file) {
            super(new AutoValue_FileOutputOptions_FileOutputOptionsInternal.Builder());
            Preconditions.checkNotNull(file, "File can't be null.");
            FileOutputOptionsInternal.Builder builder = (FileOutputOptionsInternal.Builder) this.mRootInternalBuilder;
            this.mInternalBuilder = builder;
            builder.setFile(file);
        }

        @Override // androidx.camera.video.OutputOptions.Builder
        public FileOutputOptions build() {
            return new FileOutputOptions(this.mInternalBuilder.build());
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.camera.video.FileOutputOptions$Builder, java.lang.Object] */
        @Override // androidx.camera.video.OutputOptions.Builder
        public /* bridge */ /* synthetic */ Builder setDurationLimitMillis(@IntRange(from = 0) long j11) {
            return super.setDurationLimitMillis(j11);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.camera.video.FileOutputOptions$Builder, java.lang.Object] */
        @Override // androidx.camera.video.OutputOptions.Builder
        public /* bridge */ /* synthetic */ Builder setFileSizeLimit(@IntRange(from = 0) long j11) {
            return super.setFileSizeLimit(j11);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.camera.video.FileOutputOptions$Builder, java.lang.Object] */
        @Override // androidx.camera.video.OutputOptions.Builder
        public /* bridge */ /* synthetic */ Builder setLocation(Location location) {
            return super.setLocation(location);
        }
    }

    @AutoValue
    public static abstract class FileOutputOptionsInternal extends OutputOptions.OutputOptionsInternal {

        @AutoValue.Builder
        public static abstract class Builder extends OutputOptions.OutputOptionsInternal.Builder<Builder> {
            @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
            public abstract FileOutputOptionsInternal build();

            public abstract Builder setFile(File file);
        }

        public abstract File getFile();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FileOutputOptions) {
            return this.mFileOutputOptionsInternal.equals(((FileOutputOptions) obj).mFileOutputOptionsInternal);
        }
        return false;
    }

    public File getFile() {
        return this.mFileOutputOptionsInternal.getFile();
    }

    public int hashCode() {
        return this.mFileOutputOptionsInternal.hashCode();
    }

    public String toString() {
        return this.mFileOutputOptionsInternal.toString().replaceFirst("FileOutputOptionsInternal", "FileOutputOptions");
    }

    public FileOutputOptions(FileOutputOptionsInternal fileOutputOptionsInternal) {
        super(fileOutputOptionsInternal);
        this.mFileOutputOptionsInternal = fileOutputOptionsInternal;
    }
}
