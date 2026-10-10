package ad0;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.core.content.res.ResourcesCompat;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import com.trtc.uikit.livekit.R$drawable;
import ed0.InterfaceC37135a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: ad0.a */
/* JADX INFO: compiled from: DefaultEmojiResource.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\b\u0010\u000f\u001a\u00020\u0007H\u0016J\"\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R*\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m90084d2 = {"Lcom/trtc/uikit/livekit/component/barrage/store/model/DefaultEmojiResource;", "Lcom/trtc/uikit/livekit/component/barrage/viewmodel/IEmojiResource;", "<init>", "()V", InterfaceC33617e1.f69660i, "Ljava/util/LinkedHashMap;", "", "", "Lkotlin/collections/LinkedHashMap;", "getResId", "key", "getResIds", "", "getEncodeValue", "resId", "getEncodePattern", "getDrawable", "Landroid/graphics/drawable/Drawable;", "context", "Landroid/content/Context;", "bounds", "Landroid/graphics/Rect;", "tuilivekit_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDefaultEmojiResource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultEmojiResource.kt\ncom/trtc/uikit/livekit/component/barrage/store/model/DefaultEmojiResource\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n*L\n1#1,101:1\n216#2,2:102\n1#3:104\n28#4:105\n*S KotlinDebug\n*F\n+ 1 DefaultEmojiResource.kt\ncom/trtc/uikit/livekit/component/barrage/store/model/DefaultEmojiResource\n*L\n81#1:102,2\n98#1:105\n*E\n"})
public final class C0241a implements InterfaceC37135a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final LinkedHashMap<Integer, String> f705a = MapsKt.linkedMapOf(TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_0), "[TUIEmoji_Smile]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_1), "[TUIEmoji_Expect]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_2), "[TUIEmoji_Blink]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_3), "[TUIEmoji_Guffaw]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_4), "[TUIEmoji_KindSmile]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_5), "[TUIEmoji_Haha]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_6), "[TUIEmoji_Cheerful]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_7), "[TUIEmoji_Speechless]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_8), "[TUIEmoji_Amazed]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_9), "[TUIEmoji_Sorrow]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_10), "[TUIEmoji_Complacent]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_11), "[TUIEmoji_Silly]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_12), "[TUIEmoji_Lustful]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_13), "[TUIEmoji_Giggle]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_14), "[TUIEmoji_Kiss]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_15), "[TUIEmoji_Wail]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_16), "[TUIEmoji_TearsLaugh]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_17), "[TUIEmoji_Trapped]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_18), "[TUIEmoji_Mask]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_19), "[TUIEmoji_Fear]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_20), "[TUIEmoji_BareTeeth]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_21), "[TUIEmoji_FlareUp]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_22), "[TUIEmoji_Yawn]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_23), "[TUIEmoji_Tact]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_24), "[TUIEmoji_Stareyes]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_25), "[TUIEmoji_ShutUp]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_26), "[TUIEmoji_Sigh]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_27), "[TUIEmoji_Hehe]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_28), "[TUIEmoji_Silent]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_29), "[TUIEmoji_Surprised]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_30), "[TUIEmoji_Askance]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_31), "[TUIEmoji_Ok]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_32), "[TUIEmoji_Shit]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_33), "[TUIEmoji_Monster]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_34), "[TUIEmoji_Daemon]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_35), "[TUIEmoji_Rage]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_36), "[TUIEmoji_Fool]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_37), "[TUIEmoji_Pig]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_38), "[TUIEmoji_Cow]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_39), "[TUIEmoji_Ai]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_40), "[TUIEmoji_Skull]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_41), "[TUIEmoji_Bombs]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_42), "[TUIEmoji_Coffee]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_43), "[TUIEmoji_Cake]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_44), "[TUIEmoji_Beer]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_45), "[TUIEmoji_Flower]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_46), "[TUIEmoji_Watermelon]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_47), "[TUIEmoji_Rich]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_48), "[TUIEmoji_Heart]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_49), "[TUIEmoji_Moon]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_50), "[TUIEmoji_Sun]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_51), "[TUIEmoji_Star]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_52), "[TUIEmoji_RedPacket]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_53), "[TUIEmoji_Celebrate]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_54), "[TUIEmoji_Bless]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_55), "[TUIEmoji_Fortune]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_56), "[TUIEmoji_Convinced]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_57), "[TUIEmoji_Prohibit]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_58), "[TUIEmoji_666]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_59), "[TUIEmoji_857]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_60), "[TUIEmoji_Knife]"), TuplesKt.m90091to(Integer.valueOf(R$drawable.live_barrage_emoji_61), "[TUIEmoji_Like]"));

    @Override // ed0.InterfaceC37135a
    @NotNull
    /* JADX INFO: renamed from: a */
    public Drawable mo874a(@NotNull Context context, int i11, @Nullable Rect rect) {
        Intrinsics.checkNotNullParameter(context, "context");
        Drawable drawable = ResourcesCompat.getDrawable(context.getResources(), i11, null);
        if (drawable == null) {
            return new ColorDrawable(0);
        }
        if (rect != null) {
            drawable.setBounds(rect.left, rect.top, rect.right, rect.bottom);
        }
        return drawable;
    }

    @Override // ed0.InterfaceC37135a
    @NotNull
    /* JADX INFO: renamed from: b */
    public String mo875b(int i11) {
        String str = this.f705a.get(Integer.valueOf(i11));
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: c */
    public int m876c(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        for (Map.Entry<Integer, String> entry : this.f705a.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            if (TextUtils.equals(key, entry.getValue())) {
                return iIntValue;
            }
        }
        return 0;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public List<Integer> m877d() {
        Set<Integer> setKeySet = this.f705a.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
        return CollectionsKt.toList(setKeySet);
    }
}
