package com.kubi.mine.lib.p101ui;

import android.os.Bundle;
import com.blankj.utilcode.util.C5286o;
import com.kubi.mine.R$anim;
import com.kubi.mine.R$id;
import com.kubi.mine.R$layout;
import com.kubi.sdk.BaseActivity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: MineActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u000e\u001a\u00020\u000bH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/mine/lib/ui/MineActivity;", "Lcom/kubi/sdk/BaseActivity;", "<init>", "()V", "fragment", "Lcom/kubi/mine/lib/ui/MineFragment;", "getFragment", "()Lcom/kubi/mine/lib/ui/MineFragment;", "fragment$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "finish", "MineLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MineActivity extends BaseActivity {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ int f35189j = 0;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final Lazy f35190i = LazyKt.lazy(new Function0() { // from class: com.kubi.mine.lib.ui.m0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MineActivity.m41946U();
        }
    });

    /* JADX INFO: renamed from: U */
    public static final MineFragment m41946U() {
        return new MineFragment();
    }

    /* JADX INFO: renamed from: V */
    public final MineFragment m41947V() {
        return (MineFragment) this.f35190i.getValue();
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(R$anim.anim_right_in_300, R$anim.anim_left_out_300);
    }

    @Override // com.kubi.sdk.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) throws Throwable {
        super.onCreate(savedInstanceState);
        setContentView(R$layout.bmine_layout_activity);
        overridePendingTransition(R$anim.anim_left_in_300, R$anim.anim_right_out_300);
        hideTitleBar();
        C5286o.m6327k(getSupportFragmentManager(), m41947V(), R$id.layout_container);
    }
}
