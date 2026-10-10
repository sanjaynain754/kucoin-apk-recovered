package com.otaliastudios.opengl.texture;

import android.opengl.GLES20;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.tencent.qcloud.tuicore.TUIConstants;
import l90.C42139a;
import l90.C42141c;
import l90.InterfaceC42140b;
import n90.C42786f;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.UInt;
import p852kotlin.UIntArray;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: GlTexture.kt */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001BU\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fB)\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0017\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u0013\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016¨\u0006\u001e"}, m90084d2 = {"Lcom/otaliastudios/opengl/texture/GlTexture;", "Ll90/b;", "", "unit", "target", "id", "width", "height", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, "internalFormat", "type", "<init>", "(IILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "(IILjava/lang/Integer;)V", "", "bind", "()V", "unbind", "g", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "I", "getUnit", "()I", "b", "d", "c", "Ljava/lang/Integer;", "f", "()Ljava/lang/Integer;", "e", "library_release"}, m90085k = 1, m90086mv = {1, 5, 1}, m90088xi = 48)
public final class GlTexture implements InterfaceC42140b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int unit;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int target;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final Integer width;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public final Integer height;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public final Integer format;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public final Integer type;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final int id;

    @JvmOverloads
    public GlTexture() {
        this(0, 0, null, 7, null);
    }

    /* JADX INFO: renamed from: g */
    public final void m67861g() {
        int[] iArr = {UInt.m103939constructorimpl(this.id)};
        int iM104000getSizeimpl = UIntArray.m104000getSizeimpl(iArr);
        int[] iArr2 = new int[iM104000getSizeimpl];
        for (int i11 = 0; i11 < iM104000getSizeimpl; i11++) {
            iArr2[i11] = UIntArray.m103999getpVg5ArA(iArr, i11);
        }
        GLES20.glDeleteTextures(1, iArr2, 0);
        Unit unit = Unit.INSTANCE;
        UIntArray.m104004setVXSXFK8(iArr, 0, UInt.m103939constructorimpl(iArr2[0]));
    }

    public GlTexture(int i11, int i12, Integer num, Integer num2, Integer num3, Integer num4, final Integer num5, Integer num6) {
        int iIntValue;
        this.unit = i11;
        this.target = i12;
        this.width = num2;
        this.height = num3;
        this.format = num4;
        this.type = num6;
        if (num == null) {
            int[] iArrM103993constructorimpl = UIntArray.m103993constructorimpl(1);
            int iM104000getSizeimpl = UIntArray.m104000getSizeimpl(iArrM103993constructorimpl);
            int[] iArr = new int[iM104000getSizeimpl];
            for (int i13 = 0; i13 < iM104000getSizeimpl; i13++) {
                iArr[i13] = UIntArray.m103999getpVg5ArA(iArrM103993constructorimpl, i13);
            }
            GLES20.glGenTextures(1, iArr, 0);
            Unit unit = Unit.INSTANCE;
            UIntArray.m104004setVXSXFK8(iArrM103993constructorimpl, 0, UInt.m103939constructorimpl(iArr[0]));
            C42139a.m92478b("glGenTextures");
            iIntValue = UIntArray.m103999getpVg5ArA(iArrM103993constructorimpl, 0);
        } else {
            iIntValue = num.intValue();
        }
        this.id = iIntValue;
        if (num == null) {
            C42141c.m92480a(this, new Function0<Unit>() { // from class: com.otaliastudios.opengl.texture.GlTexture.1
                @Override // p852kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (GlTexture.this.getWidth() != null && GlTexture.this.getHeight() != null && GlTexture.this.getFormat() != null && num5 != null && GlTexture.this.getType() != null) {
                        GLES20.glTexImage2D(UInt.m103939constructorimpl(GlTexture.this.getTarget()), 0, num5.intValue(), GlTexture.this.getWidth().intValue(), GlTexture.this.getHeight().intValue(), 0, UInt.m103939constructorimpl(GlTexture.this.getFormat().intValue()), UInt.m103939constructorimpl(GlTexture.this.getType().intValue()), null);
                    }
                    GLES20.glTexParameterf(UInt.m103939constructorimpl(GlTexture.this.getTarget()), C42786f.m93765l(), C42786f.m93760g());
                    GLES20.glTexParameterf(UInt.m103939constructorimpl(GlTexture.this.getTarget()), C42786f.m93764k(), C42786f.m93758e());
                    GLES20.glTexParameteri(UInt.m103939constructorimpl(GlTexture.this.getTarget()), C42786f.m93766m(), C42786f.m93754a());
                    GLES20.glTexParameteri(UInt.m103939constructorimpl(GlTexture.this.getTarget()), C42786f.m93767n(), C42786f.m93754a());
                    C42139a.m92478b("glTexParameter");
                }
            });
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getFormat() {
        return this.format;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getHeight() {
        return this.height;
    }

    @Override // l90.InterfaceC42140b
    public void bind() {
        GLES20.glActiveTexture(UInt.m103939constructorimpl(this.unit));
        GLES20.glBindTexture(UInt.m103939constructorimpl(this.target), UInt.m103939constructorimpl(this.id));
        C42139a.m92478b("bind");
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getTarget() {
        return this.target;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getWidth() {
        return this.width;
    }

    @Override // l90.InterfaceC42140b
    public void unbind() {
        GLES20.glBindTexture(UInt.m103939constructorimpl(this.target), UInt.m103939constructorimpl(0));
        GLES20.glActiveTexture(C42786f.m93762i());
        C42139a.m92478b("unbind");
    }

    public /* synthetic */ GlTexture(int i11, int i12, Integer num, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C42786f.m93762i() : i11, (i13 & 2) != 0 ? C42786f.m93763j() : i12, (i13 & 4) != 0 ? null : num);
    }

    @JvmOverloads
    public GlTexture(int i11, int i12, @Nullable Integer num) {
        this(i11, i12, num, null, null, null, null, null);
    }
}
