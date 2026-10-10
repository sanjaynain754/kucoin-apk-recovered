package com.jumio.core;

import com.tencent.qcloud.tuicore.TUIConstants;
import java.io.Serializable;
import jumio.core.EnumC40690l2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\u001a\u0010\u001f\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\u001a\u0010\"\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0019\"\u0004\b$\u0010\u001bR\u001a\u0010%\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0019\"\u0004\b'\u0010\u001b¨\u0006("}, m90084d2 = {"Lcom/jumio/core/JumioMrzData;", "Ljava/io/Serializable;", "<init>", "()V", "mrzLine1", "", "getMrzLine1", "()Ljava/lang/String;", "setMrzLine1", "(Ljava/lang/String;)V", "mrzLine2", "getMrzLine2", "setMrzLine2", "mrzLine3", "getMrzLine3", "setMrzLine3", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, "Lcom/jumio/core/enums/MRZFormat;", "getFormat", "()Lcom/jumio/core/enums/MRZFormat;", "setFormat", "(Lcom/jumio/core/enums/MRZFormat;)V", "dobValid", "", "getDobValid", "()Z", "setDobValid", "(Z)V", "idNumberValid", "getIdNumberValid", "setIdNumberValid", "expiryDateValid", "getExpiryDateValid", "setExpiryDateValid", "personalNumberValid", "getPersonalNumberValid", "setPersonalNumberValid", "compositeValid", "getCompositeValid", "setCompositeValid", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class JumioMrzData implements Serializable {

    /* JADX INFO: renamed from: a */
    public String f13614a;

    /* JADX INFO: renamed from: b */
    public String f13615b;

    /* JADX INFO: renamed from: c */
    public String f13616c;

    /* JADX INFO: renamed from: e */
    public boolean f13618e;

    /* JADX INFO: renamed from: f */
    public boolean f13619f;

    /* JADX INFO: renamed from: g */
    public boolean f13620g;

    /* JADX INFO: renamed from: i */
    public boolean f13622i;

    /* JADX INFO: renamed from: d */
    public EnumC40690l2 f13617d = EnumC40690l2.MRP;

    /* JADX INFO: renamed from: h */
    public boolean f13621h = true;

    /* JADX INFO: renamed from: getCompositeValid, reason: from getter */
    public final boolean getF13622i() {
        return this.f13622i;
    }

    /* JADX INFO: renamed from: getDobValid, reason: from getter */
    public final boolean getF13618e() {
        return this.f13618e;
    }

    /* JADX INFO: renamed from: getExpiryDateValid, reason: from getter */
    public final boolean getF13620g() {
        return this.f13620g;
    }

    @NotNull
    /* JADX INFO: renamed from: getFormat, reason: from getter */
    public final EnumC40690l2 getF13617d() {
        return this.f13617d;
    }

    /* JADX INFO: renamed from: getIdNumberValid, reason: from getter */
    public final boolean getF13619f() {
        return this.f13619f;
    }

    @Nullable
    /* JADX INFO: renamed from: getMrzLine1, reason: from getter */
    public final String getF13614a() {
        return this.f13614a;
    }

    @Nullable
    /* JADX INFO: renamed from: getMrzLine2, reason: from getter */
    public final String getF13615b() {
        return this.f13615b;
    }

    @Nullable
    /* JADX INFO: renamed from: getMrzLine3, reason: from getter */
    public final String getF13616c() {
        return this.f13616c;
    }

    /* JADX INFO: renamed from: getPersonalNumberValid, reason: from getter */
    public final boolean getF13621h() {
        return this.f13621h;
    }

    public final void setCompositeValid(boolean z11) {
        this.f13622i = z11;
    }

    public final void setDobValid(boolean z11) {
        this.f13618e = z11;
    }

    public final void setExpiryDateValid(boolean z11) {
        this.f13620g = z11;
    }

    public final void setFormat(@NotNull EnumC40690l2 enumC40690l2) {
        Intrinsics.checkNotNullParameter(enumC40690l2, "<set-?>");
        this.f13617d = enumC40690l2;
    }

    public final void setIdNumberValid(boolean z11) {
        this.f13619f = z11;
    }

    public final void setMrzLine1(@Nullable String str) {
        this.f13614a = str;
    }

    public final void setMrzLine2(@Nullable String str) {
        this.f13615b = str;
    }

    public final void setMrzLine3(@Nullable String str) {
        this.f13616c = str;
    }

    public final void setPersonalNumberValid(boolean z11) {
        this.f13621h = z11;
    }
}
