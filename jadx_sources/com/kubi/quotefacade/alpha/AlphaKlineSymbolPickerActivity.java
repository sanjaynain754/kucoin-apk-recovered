package com.kubi.quotefacade.alpha;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import com.kubi.config.exception.KCConfigException;
import com.kubi.p110rn.p111ui.KCBridgeRejecterError;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.quotefacade.entity.CurrencyFilterTransferData;
import com.kubi.quotefacade.entity.SymbolData;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: AlphaKlineSymbolPickerActivity.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\u0012\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\b\u0010\r\u001a\u00020\u0007H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/quotefacade/alpha/AlphaKlineSymbolPickerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "completed", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "complete", "transferData", "Lcom/kubi/quotefacade/entity/CurrencyFilterTransferData;", "onDestroy", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAlphaKlineSymbolPickerActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlphaKlineSymbolPickerActivity.kt\ncom/kubi/quotefacade/alpha/AlphaKlineSymbolPickerActivity\n+ 2 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,79:1\n44#2,2:80\n*S KotlinDebug\n*F\n+ 1 AlphaKlineSymbolPickerActivity.kt\ncom/kubi/quotefacade/alpha/AlphaKlineSymbolPickerActivity\n*L\n40#1:80,2\n*E\n"})
public final class AlphaKlineSymbolPickerActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final Companion f41135j = new Companion(null);

    /* JADX INFO: renamed from: i */
    public boolean f41136i;

    /* JADX INFO: compiled from: AlphaKlineSymbolPickerActivity.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/kubi/quotefacade/alpha/AlphaKlineSymbolPickerActivity$Companion;", "", "<init>", "()V", "EXTRA_TOKEN_BRIDGE_ID", "", "TAG", "DIALOG_TAG", InterfaceC33617e1.f69659h, "", "context", "Landroid/content/Context;", "tokenBridgeId", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void launch(@NotNull Context context, @Nullable String tokenBridgeId) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) AlphaKlineSymbolPickerActivity.class);
            intent.putExtra("tokenBridgeId", tokenBridgeId);
            context.startActivity(intent);
            if (context instanceof Activity) {
                ((Activity) context).overridePendingTransition(0, 0);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(null);
        CurrencyFilterTransferData currencyFilterTransferData = new CurrencyFilterTransferData("alpha", null, null, new SymbolData(getIntent().getStringExtra("tokenBridgeId"), null, 2, null), 6, null);
        try {
            IQuoteFacadeService iQuoteFacadeService = IQuoteFacadeService.f41383a.get();
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            iQuoteFacadeService.mo50714q(this, supportFragmentManager, currencyFilterTransferData, "AlphaKlineRnToggleSymbolDialog", new Function2() { // from class: com.kubi.quotefacade.alpha.i
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AlphaKlineSymbolPickerActivity.m50329I(this.f41280b, (CurrencyFilterTransferData) obj, (KCBridgeRejecterError) obj2);
                }
            });
        } catch (Exception e11) {
            C44128b.m97263g("AlphaKlineSymbolPicker", e11);
            C43846g.m96568c(new KCConfigException(e11, "AlphaKlineSymbolPicker", false, null, 8, null), null, 2, null);
            m50330H(null);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m50330H(CurrencyFilterTransferData currencyFilterTransferData) {
        if (this.f41136i) {
            return;
        }
        this.f41136i = true;
        AlphaKlineTransmitReceiver.f41137c.finishPicker$QuoteFacadeLib_googleRelease(currencyFilterTransferData);
        finish();
        overridePendingTransition(0, 0);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (!this.f41136i) {
            AlphaKlineTransmitReceiver.f41137c.finishPicker$QuoteFacadeLib_googleRelease(null);
        }
        super.onDestroy();
    }

    /* JADX INFO: renamed from: I */
    public static final Unit m50329I(AlphaKlineSymbolPickerActivity alphaKlineSymbolPickerActivity, CurrencyFilterTransferData currencyFilterTransferData, KCBridgeRejecterError kCBridgeRejecterError) {
        alphaKlineSymbolPickerActivity.m50330H(currencyFilterTransferData);
        return Unit.INSTANCE;
    }
}
