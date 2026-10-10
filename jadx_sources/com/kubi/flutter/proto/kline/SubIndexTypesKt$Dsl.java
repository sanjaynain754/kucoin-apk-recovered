package com.kubi.flutter.proto.kline;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.ProtoDslMarker;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SubIndexTypesKt.kt */
/* JADX INFO: loaded from: classes13.dex */
@ProtoDslMarker
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001f B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J%\u0010\u000e\u001a\u00020\u000f*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u0010\u001a\u00020\nH\u0007¢\u0006\u0002\b\u0011J&\u0010\u0012\u001a\u00020\u000f*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u0010\u001a\u00020\nH\u0087\n¢\u0006\u0002\b\u0013J+\u0010\u0014\u001a\u00020\u000f*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0016H\u0007¢\u0006\u0002\b\u0017J,\u0010\u0012\u001a\u00020\u000f*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0016H\u0087\n¢\u0006\u0002\b\u0018J.\u0010\u0019\u001a\u00020\u000f*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\nH\u0087\u0002¢\u0006\u0002\b\u001cJ\u001d\u0010\u001d\u001a\u00020\u000f*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0007¢\u0006\u0002\b\u001eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006!"}, m90084d2 = {"Lcom/kubi/flutter/proto/kline/SubIndexTypesKt$Dsl;", "", "_builder", "Lcom/kubi/flutter/proto/kline/SubIndexTypes$Builder;", "<init>", "(Lcom/kubi/flutter/proto/kline/SubIndexTypes$Builder;)V", "_build", "Lcom/kubi/flutter/proto/kline/SubIndexTypes;", FirebaseAnalytics.Param.ITEMS, "Lcom/google/protobuf/kotlin/DslList;", "Lcom/kubi/flutter/proto/kline/SubIndexType;", "Lcom/kubi/flutter/proto/kline/SubIndexTypesKt$Dsl$ItemsProxy;", "getItems", "()Lcom/google/protobuf/kotlin/DslList;", "add", "", "value", "addItems", "plusAssign", "plusAssignItems", "addAll", "values", "", "addAllItems", "plusAssignAllItems", "set", "index", "", "setItems", "clear", "clearItems", "Companion", "ItemsProxy", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SubIndexTypesKt$Dsl {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f22198b = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final SubIndexTypes.C12721c f22199a;

    /* JADX INFO: compiled from: SubIndexTypesKt.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¨\u0006\b"}, m90084d2 = {"Lcom/kubi/flutter/proto/kline/SubIndexTypesKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/kubi/flutter/proto/kline/SubIndexTypesKt$Dsl;", "builder", "Lcom/kubi/flutter/proto/kline/SubIndexTypes$Builder;", "LKLineWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @PublishedApi
        public final /* synthetic */ SubIndexTypesKt$Dsl _create(SubIndexTypes.C12721c builder) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            return new SubIndexTypesKt$Dsl(builder, null);
        }
    }

    public /* synthetic */ SubIndexTypesKt$Dsl(SubIndexTypes.C12721c c12721c, DefaultConstructorMarker defaultConstructorMarker) {
        this(c12721c);
    }

    public SubIndexTypesKt$Dsl(SubIndexTypes.C12721c c12721c) {
        this.f22199a = c12721c;
    }

    @PublishedApi
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SubIndexTypes m24040a() {
        SubIndexTypes subIndexTypesBuild = this.f22199a.build();
        Intrinsics.checkNotNullExpressionValue(subIndexTypesBuild, "build(...)");
        return subIndexTypesBuild;
    }

    @JvmName(name = "addAllItems")
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m24041b(DslList dslList, Iterable values) {
        Intrinsics.checkNotNullParameter(dslList, "<this>");
        Intrinsics.checkNotNullParameter(values, "values");
        this.f22199a.m24038a(values);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ DslList m24042c() {
        List<SubIndexType> listM24039b = this.f22199a.m24039b();
        Intrinsics.checkNotNullExpressionValue(listM24039b, "getItemsList(...)");
        return new DslList(listM24039b);
    }
}
