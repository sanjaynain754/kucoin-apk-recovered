package com.otaliastudios.opengl.program;

import android.opengl.GLES20;
import androidx.media3.exoplayer.upstream.CmcdData;
import l90.C42139a;
import n90.C42786f;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.UInt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GlShader.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\r\u0010\u0010¨\u0006\u0013"}, m90084d2 = {"Lcom/otaliastudios/opengl/program/GlShader;", "", "", "type", "id", "<init>", "(II)V", "", "source", "(ILjava/lang/String;)V", "", "b", "()V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "I", "getType", "()I", "c", "Companion", "library_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class GlShader {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int id;

    /* JADX INFO: compiled from: GlShader.kt */
    @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"Lcom/otaliastudios/opengl/program/GlShader$Companion;", "", "<init>", "()V", "", "type", "", "source", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(ILjava/lang/String;)I", "library_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final int m67850a(int type, String source) {
            int iM103939constructorimpl = UInt.m103939constructorimpl(GLES20.glCreateShader(UInt.m103939constructorimpl(type)));
            C42139a.m92478b(Intrinsics.stringPlus("glCreateShader type=", Integer.valueOf(type)));
            GLES20.glShaderSource(iM103939constructorimpl, source);
            GLES20.glCompileShader(iM103939constructorimpl);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(iM103939constructorimpl, C42786f.m93755b(), iArr, 0);
            if (iArr[0] != 0) {
                return iM103939constructorimpl;
            }
            String str = "Could not compile shader " + type + ": '" + ((Object) GLES20.glGetShaderInfoLog(iM103939constructorimpl)) + "' source: " + source;
            GLES20.glDeleteShader(iM103939constructorimpl);
            throw new RuntimeException(str);
        }
    }

    public GlShader(int i11, int i12) {
        this.type = i11;
        this.id = i12;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GlShader(int i11, @NotNull String source) {
        this(i11, INSTANCE.m67850a(i11, source));
        Intrinsics.checkNotNullParameter(source, "source");
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b */
    public final void m67849b() {
        GLES20.glDeleteShader(UInt.m103939constructorimpl(this.id));
    }
}
