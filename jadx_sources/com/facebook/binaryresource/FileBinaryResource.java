package com.facebook.binaryresource;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p486o3.InterfaceC42952a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: FileBinaryResource.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, m90084d2 = {"Lcom/facebook/binaryresource/FileBinaryResource;", "Lo3/a;", "Ljava/io/File;", "file", "<init>", "(Ljava/io/File;)V", "Ljava/io/InputStream;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/io/InputStream;", "", "size", "()J", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/io/File;", "d", "()Ljava/io/File;", "b", "Companion", "imagepipeline-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class FileBinaryResource implements InterfaceC42952a {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final File file;

    /* JADX INFO: compiled from: FileBinaryResource.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\t"}, m90084d2 = {"Lcom/facebook/binaryresource/FileBinaryResource$Companion;", "", "<init>", "()V", "createOrNull", "Lcom/facebook/binaryresource/FileBinaryResource;", "file", "Ljava/io/File;", "create", "imagepipeline-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nFileBinaryResource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileBinaryResource.kt\ncom/facebook/binaryresource/FileBinaryResource$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n1#2:54\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final FileBinaryResource createOrNull(@Nullable File file) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (file != null) {
                return new FileBinaryResource(file, defaultConstructorMarker);
            }
            return null;
        }

        public Companion() {
        }

        @JvmStatic
        @NotNull
        public final FileBinaryResource create(@NotNull File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            return new FileBinaryResource(file, null);
        }
    }

    public /* synthetic */ FileBinaryResource(File file, DefaultConstructorMarker defaultConstructorMarker) {
        this(file);
    }

    public FileBinaryResource(File file) {
        this.file = file;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final FileBinaryResource m8378b(@NotNull File file) {
        return INSTANCE.create(file);
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: c */
    public static final FileBinaryResource m8379c(@Nullable File file) {
        return INSTANCE.createOrNull(file);
    }

    @Override // p486o3.InterfaceC42952a
    @NotNull
    /* JADX INFO: renamed from: a */
    public InputStream mo8380a() throws IOException {
        return new FileInputStream(this.file);
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final File getFile() {
        return this.file;
    }

    public boolean equals(@Nullable Object other) {
        if (other == null || !(other instanceof FileBinaryResource)) {
            return false;
        }
        return Intrinsics.areEqual(this.file, ((FileBinaryResource) other).file);
    }

    public int hashCode() {
        return this.file.hashCode();
    }

    @Override // p486o3.InterfaceC42952a
    public long size() {
        return this.file.length();
    }
}
