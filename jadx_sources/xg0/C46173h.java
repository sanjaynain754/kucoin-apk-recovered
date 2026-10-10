package xg0;

import androidx.media3.exoplayer.upstream.CmcdData;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: xg0.h */
/* JADX INFO: compiled from: JsonElementBuilders.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0002\b\r\u001a4\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005¢\u0006\u0004\b\b\u0010\t\u001a4\u0010\u000b\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u000b\u0010\t\u001a%\u0010\u000e\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a%\u0010\u0011\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012\u001a%\u0010\u0013\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001b\u0010\u0015\u001a\u00020\f*\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001b\u0010\u0017\u001a\u00020\f*\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001b\u0010\u0019\u001a\u00020\f*\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a*\u0010\u001b\u001a\u00020\f*\u00020\n2\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m90084d2 = {"Lxg0/a0;", "", "key", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "builderAction", "Lkotlinx/serialization/json/JsonElement;", "i", "(Lxg0/a0;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lkotlinx/serialization/json/JsonElement;", "Lxg0/b;", CmcdData.Factory.STREAMING_FORMAT_HLS, "", "value", "e", "(Lxg0/a0;Ljava/lang/String;Ljava/lang/Boolean;)Lkotlinx/serialization/json/JsonElement;", "", "f", "(Lxg0/a0;Ljava/lang/String;Ljava/lang/Number;)Lkotlinx/serialization/json/JsonElement;", "g", "(Lxg0/a0;Ljava/lang/String;Ljava/lang/String;)Lkotlinx/serialization/json/JsonElement;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(Lxg0/b;Ljava/lang/Boolean;)Z", "b", "(Lxg0/b;Ljava/lang/Number;)Z", "c", "(Lxg0/b;Ljava/lang/String;)Z", "d", "(Lxg0/b;Lkotlin/jvm/functions/Function1;)Z", "kotlinx-serialization-json"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nJsonElementBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonElementBuilders.kt\nkotlinx/serialization/json/JsonElementBuildersKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,231:1\n29#1,3:232\n52#1,3:235\n29#1,3:238\n52#1,3:241\n1557#2:244\n1628#2,3:245\n1557#2:248\n1628#2,3:249\n1557#2:252\n1628#2,3:253\n*S KotlinDebug\n*F\n+ 1 JsonElementBuilders.kt\nkotlinx/serialization/json/JsonElementBuildersKt\n*L\n82#1:232,3\n90#1:235,3\n189#1:238,3\n197#1:241,3\n207#1:244\n207#1:245,3\n217#1:248\n217#1:249,3\n227#1:252\n227#1:253,3\n*E\n"})
public final class C46173h {
    /* JADX INFO: renamed from: a */
    public static final boolean m101803a(@NotNull C46164b c46164b, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(c46164b, "<this>");
        return c46164b.m101770a(C46174i.m101812a(bool));
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m101804b(@NotNull C46164b c46164b, @Nullable Number number) {
        Intrinsics.checkNotNullParameter(c46164b, "<this>");
        return c46164b.m101770a(C46174i.m101813b(number));
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m101805c(@NotNull C46164b c46164b, @Nullable String str) {
        Intrinsics.checkNotNullParameter(c46164b, "<this>");
        return c46164b.m101770a(C46174i.m101814c(str));
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m101806d(@NotNull C46164b c46164b, @NotNull Function1<? super C46163a0, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(c46164b, "<this>");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        C46163a0 c46163a0 = new C46163a0();
        builderAction.invoke(c46163a0);
        return c46164b.m101770a(c46163a0.m101768a());
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public static final JsonElement m101807e(@NotNull C46163a0 c46163a0, @NotNull String key, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(c46163a0, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return c46163a0.m101769b(key, C46174i.m101812a(bool));
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static final JsonElement m101808f(@NotNull C46163a0 c46163a0, @NotNull String key, @Nullable Number number) {
        Intrinsics.checkNotNullParameter(c46163a0, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return c46163a0.m101769b(key, C46174i.m101813b(number));
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static final JsonElement m101809g(@NotNull C46163a0 c46163a0, @NotNull String key, @Nullable String str) {
        Intrinsics.checkNotNullParameter(c46163a0, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return c46163a0.m101769b(key, C46174i.m101814c(str));
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static final JsonElement m101810h(@NotNull C46163a0 c46163a0, @NotNull String key, @NotNull Function1<? super C46164b, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(c46163a0, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        C46164b c46164b = new C46164b();
        builderAction.invoke(c46164b);
        return c46163a0.m101769b(key, c46164b.m101771b());
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static final JsonElement m101811i(@NotNull C46163a0 c46163a0, @NotNull String key, @NotNull Function1<? super C46163a0, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(c46163a0, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        C46163a0 c46163a1 = new C46163a0();
        builderAction.invoke(c46163a1);
        return c46163a0.m101769b(key, c46163a1.m101768a());
    }
}
