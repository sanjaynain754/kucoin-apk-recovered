package com.facebook.fresco.animation.bitmap.cache;

import android.net.Uri;
import androidx.media3.exoplayer.upstream.CmcdData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p547q3.InterfaceC43595a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: AnimationFrameCacheKey.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\n\u0018\u0000 \n2\u00020\u0001:\u0001\u001aB\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018¨\u0006\u001b"}, m90084d2 = {"Lcom/facebook/fresco/animation/bitmap/cache/AnimationFrameCacheKey;", "Lq3/a;", "", "imageId", "", "deepEquals", "<init>", "(IZ)V", "Landroid/net/Uri;", "uri", "c", "(Landroid/net/Uri;)Z", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Ljava/lang/String;", "b", "()Z", "", "o", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Z", "Ljava/lang/String;", "animationUriString", "Companion", "animated-base_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
public final class AnimationFrameCacheKey implements InterfaceC43595a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean deepEquals;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String animationUriString;

    @Override // p547q3.InterfaceC43595a
    /* JADX INFO: renamed from: b */
    public boolean mo8759b() {
        return false;
    }

    @Override // p547q3.InterfaceC43595a
    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public String getAnimationUriString() {
        return this.animationUriString;
    }

    @Override // p547q3.InterfaceC43595a
    public boolean equals(@Nullable Object o11) {
        if (!this.deepEquals) {
            return super.equals(o11);
        }
        if (this == o11) {
            return true;
        }
        if (o11 == null || !Intrinsics.areEqual(AnimationFrameCacheKey.class, o11.getClass())) {
            return false;
        }
        return Intrinsics.areEqual(this.animationUriString, ((AnimationFrameCacheKey) o11).animationUriString);
    }

    @Override // p547q3.InterfaceC43595a
    public int hashCode() {
        return !this.deepEquals ? super.hashCode() : this.animationUriString.hashCode();
    }

    @JvmOverloads
    public AnimationFrameCacheKey(int i11, boolean z11) {
        this.deepEquals = z11;
        this.animationUriString = "anim://" + i11;
    }

    @Override // p547q3.InterfaceC43595a
    /* JADX INFO: renamed from: c */
    public boolean mo8760c(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return StringsKt.startsWith$default(string, this.animationUriString, false, 2, (Object) null);
    }
}
