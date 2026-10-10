package com.jumio.core.models;

import androidx.exifinterface.media.ExifInterface;
import com.jumio.commons.PersistWith;
import com.jumio.core.model.StaticModel;
import java.io.Serializable;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R-\u0010!\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020#0\"j\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020#`$¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u0006'"}, m90084d2 = {"Lcom/jumio/core/models/ApiCallDataModel;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/jumio/core/model/StaticModel;", "call", "Ljava/lang/Class;", "<init>", "(Ljava/lang/Class;)V", "getCall", "()Ljava/lang/Class;", "scanPartId", "", "getScanPartId", "()Ljava/lang/String;", "setScanPartId", "(Ljava/lang/String;)V", "contentId", "getContentId", "setContentId", "fireAndForget", "", "getFireAndForget", "()Z", "setFireAndForget", "(Z)V", "ignoreErrors", "getIgnoreErrors", "setIgnoreErrors", "timeout", "", "getTimeout", "()I", "setTimeout", "(I)V", "data", "Ljava/util/HashMap;", "Ljava/io/Serializable;", "Lkotlin/collections/HashMap;", "getData", "()Ljava/util/HashMap;", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@PersistWith("ApiCallDataModel")
public final class ApiCallDataModel<T> implements StaticModel {

    /* JADX INFO: renamed from: a */
    public final Class f14173a;

    /* JADX INFO: renamed from: b */
    public String f14174b;

    /* JADX INFO: renamed from: c */
    public String f14175c;

    /* JADX INFO: renamed from: d */
    public boolean f14176d;

    /* JADX INFO: renamed from: e */
    public boolean f14177e;

    /* JADX INFO: renamed from: f */
    public int f14178f;

    /* JADX INFO: renamed from: g */
    public final HashMap f14179g;

    public ApiCallDataModel(@NotNull Class<T> call) {
        Intrinsics.checkNotNullParameter(call, "call");
        this.f14173a = call;
        this.f14174b = "";
        this.f14175c = "";
        this.f14179g = new HashMap();
    }

    @NotNull
    public final Class<T> getCall() {
        return this.f14173a;
    }

    @NotNull
    /* JADX INFO: renamed from: getContentId, reason: from getter */
    public final String getF14175c() {
        return this.f14175c;
    }

    @NotNull
    public final HashMap<String, Serializable> getData() {
        return this.f14179g;
    }

    /* JADX INFO: renamed from: getFireAndForget, reason: from getter */
    public final boolean getF14176d() {
        return this.f14176d;
    }

    /* JADX INFO: renamed from: getIgnoreErrors, reason: from getter */
    public final boolean getF14177e() {
        return this.f14177e;
    }

    @NotNull
    /* JADX INFO: renamed from: getScanPartId, reason: from getter */
    public final String getF14174b() {
        return this.f14174b;
    }

    /* JADX INFO: renamed from: getTimeout, reason: from getter */
    public final int getF14178f() {
        return this.f14178f;
    }

    public final void setContentId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f14175c = str;
    }

    public final void setFireAndForget(boolean z11) {
        this.f14176d = z11;
    }

    public final void setIgnoreErrors(boolean z11) {
        this.f14177e = z11;
    }

    public final void setScanPartId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f14174b = str;
    }

    public final void setTimeout(int i11) {
        this.f14178f = i11;
    }
}
