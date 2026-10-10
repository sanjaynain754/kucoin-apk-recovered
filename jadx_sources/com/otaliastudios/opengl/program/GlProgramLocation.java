package com.otaliastudios.opengl.program;

import android.opengl.GLES20;
import androidx.media3.exoplayer.upstream.CmcdData;
import l90.C42139a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.UInt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GlProgramLocation.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00152\u00020\u0001:\u0002\u0016\u0017B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R#\u0010\u0014\u001a\u00020\u00128\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\n\u0010\u0010\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, m90084d2 = {"Lcom/otaliastudios/opengl/program/GlProgramLocation;", "", "", "program", "Lcom/otaliastudios/opengl/program/GlProgramLocation$Type;", "type", "", "name", "<init>", "(ILcom/otaliastudios/opengl/program/GlProgramLocation$Type;Ljava/lang/String;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "b", "I", "()I", "value", "Lkotlin/UInt;", "c", "uvalue", "d", "Companion", "Type", "library_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class GlProgramLocation {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int value;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int uvalue;

    /* JADX INFO: compiled from: GlProgramLocation.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\n"}, m90084d2 = {"Lcom/otaliastudios/opengl/program/GlProgramLocation$Companion;", "", "()V", "getAttrib", "Lcom/otaliastudios/opengl/program/GlProgramLocation;", "program", "", "name", "", "getUniform", "library_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final GlProgramLocation getAttrib(int program, @NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new GlProgramLocation(program, Type.ATTRIB, name, null);
        }

        @NotNull
        public final GlProgramLocation getUniform(int program, @NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return new GlProgramLocation(program, Type.UNIFORM, name, null);
        }
    }

    /* JADX INFO: compiled from: GlProgramLocation.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m90084d2 = {"Lcom/otaliastudios/opengl/program/GlProgramLocation$Type;", "", "(Ljava/lang/String;I)V", "ATTRIB", "UNIFORM", "library_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
    public enum Type {
        ATTRIB,
        UNIFORM
    }

    public /* synthetic */ GlProgramLocation(int i11, Type type, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, type, str);
    }

    /* JADX INFO: renamed from: com.otaliastudios.opengl.program.GlProgramLocation$a */
    /* JADX INFO: compiled from: GlProgramLocation.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 5, 1}, m90088xi = 48)
    public /* synthetic */ class C27329a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Type.values().length];
            iArr[Type.ATTRIB.ordinal()] = 1;
            iArr[Type.UNIFORM.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public GlProgramLocation(int i11, Type type, String str) {
        int iGlGetAttribLocation;
        this.name = str;
        int i12 = C27329a.$EnumSwitchMapping$0[type.ordinal()];
        if (i12 == 1) {
            iGlGetAttribLocation = GLES20.glGetAttribLocation(UInt.m103939constructorimpl(i11), str);
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iGlGetAttribLocation = GLES20.glGetUniformLocation(UInt.m103939constructorimpl(i11), str);
        }
        this.value = iGlGetAttribLocation;
        C42139a.m92479c(iGlGetAttribLocation, str);
        this.uvalue = UInt.m103939constructorimpl(iGlGetAttribLocation);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getUvalue() {
        return this.uvalue;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getValue() {
        return this.value;
    }
}
