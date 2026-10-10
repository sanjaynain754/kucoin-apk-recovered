package s00;

import com.kubi.sdk.timpush.data.entity.TimPushBind;
import com.kubi.sdk.timpush.data.model.PushBinding;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: s00.a */
/* JADX INFO: compiled from: PushBindingMapper.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\b¨\u0006\t"}, m90084d2 = {"Lcom/kubi/sdk/timpush/data/mapper/PushBindingMapper;", "", "<init>", "()V", "toNetworkModel", "Lcom/kubi/sdk/timpush/data/entity/TimPushBind;", "model", "Lcom/kubi/sdk/timpush/data/model/PushBinding;", "toNetworkModel$LTimPush_googleRelease", "LTimPush_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C44265a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C44265a f97812a = new C44265a();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final TimPushBind m97685a(@NotNull PushBinding model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return new TimPushBind(model.getRegistrationId());
    }
}
