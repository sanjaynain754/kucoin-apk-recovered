package com.jumio.core.data.document;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0012\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u000eH\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, m90084d2 = {"Lcom/jumio/core/data/document/Document;", "", "Ljava/io/Serializable;", "jsonObject", "Lorg/json/JSONObject;", "<init>", "(Lorg/json/JSONObject;)V", "code", "", "getCode", "()Ljava/lang/String;", "name", "getName", "maxPages", "", "getMaxPages", "()I", "compareTo", "other", "equals", "", "", "hashCode", "jumio-core_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class Document implements Comparable<Document>, Serializable {

    /* JADX INFO: renamed from: a */
    public final String f13795a;

    /* JADX INFO: renamed from: b */
    public final String f13796b;

    /* JADX INFO: renamed from: c */
    public final int f13797c;

    public Document(@NotNull JSONObject jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        String string = jsonObject.getString("code");
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.f13795a = string;
        String string2 = jsonObject.getString("name");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        this.f13796b = string2;
        this.f13797c = jsonObject.optInt("maxPages", 30);
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull Document other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.f13795a.compareTo(other.f13795a);
    }

    public boolean equals(@Nullable Object other) {
        return Intrinsics.areEqual(this.f13795a, other);
    }

    @NotNull
    /* JADX INFO: renamed from: getCode, reason: from getter */
    public final String getF13795a() {
        return this.f13795a;
    }

    /* JADX INFO: renamed from: getMaxPages, reason: from getter */
    public final int getF13797c() {
        return this.f13797c;
    }

    @NotNull
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getF13796b() {
        return this.f13796b;
    }

    public int hashCode() {
        return System.identityHashCode(this);
    }
}
