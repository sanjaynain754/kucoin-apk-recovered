package com.sumsub.sns.core.data.model;

import androidx.annotation.Keep;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.C41829i0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.LazyThreadSafetyMode;
import p852kotlin.Metadata;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44962o;

/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m90084d2 = {"Lcom/sumsub/sns/core/data/model/FlowType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Actions", "Standalone", "Module", "Companion", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@InterfaceC44962o
public enum FlowType {
    Actions("actions"),
    Standalone("standalone"),
    Module("module");


    @NotNull
    private final String value;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<InterfaceC44951d<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.sumsub.sns.core.data.model.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FlowType._init_$_anonymous_();
        }
    });

    /* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m90084d2 = {"Lcom/sumsub/sns/core/data/model/FlowType$Companion;", "", "<init>", "()V", "", "value", "Lcom/sumsub/sns/core/data/model/FlowType;", "get", "(Ljava/lang/String;)Lcom/sumsub/sns/core/data/model/FlowType;", "Ltg0/d;", "serializer", "()Ltg0/d;", "idensic-mobile-sdk-aar_defaultRelease"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nFlowType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowType.kt\ncom/sumsub/sns/core/data/model/FlowType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,22:1\n1#2:23\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ InterfaceC44951d get$cachedSerializer() {
            return (InterfaceC44951d) FlowType.$cachedSerializer$delegate.getValue();
        }

        @Nullable
        public final FlowType get(@Nullable String value) {
            for (FlowType flowType : FlowType.values()) {
                if (Intrinsics.areEqual(flowType.getValue(), value)) {
                    return flowType;
                }
            }
            return null;
        }

        @NotNull
        public final InterfaceC44951d<FlowType> serializer() {
            return get$cachedSerializer();
        }
    }

    @NotNull
    public static EnumEntries<FlowType> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    FlowType(String str) {
        this.value = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC44951d _init_$_anonymous_() {
        return C41829i0.m91591a("com.sumsub.sns.core.data.model.FlowType", values(), new String[]{"actions", "standalone", "module"}, new Annotation[][]{null, null, null}, null);
    }
}
