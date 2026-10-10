package p013ab;

import android.content.Context;
import android.content.Intent;
import androidx.credentials.provider.CredentialEntry;
import com.kubi.assets.search.transfer.SearchCoinFragment;
import com.kubi.sdk.BaseActivity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ab.a */
/* JADX INFO: compiled from: IntentHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/assets/helper/IntentHelper;", "", "<init>", "()V", "getSearchCoinIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "type", "", "(Landroid/content/Context;Ljava/lang/Integer;)Landroid/content/Intent;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C0226a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C0226a f682a = new C0226a();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Intent m831a(@NotNull Context context, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intent intentPutExtra = new Intent(context, (Class<?>) BaseActivity.class).putExtra("from", num).putExtra("fragment", SearchCoinFragment.class.getName()).putExtra(BaseActivity.TITLE_BAR, CredentialEntry.FALSE_STRING);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }
}
