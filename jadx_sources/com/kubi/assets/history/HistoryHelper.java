package com.kubi.assets.history;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.kubi.assets.AssetExKt;
import com.kubi.assets.R$color;
import com.kubi.assets.R$drawable;
import com.kubi.assets.R$string;
import com.kubi.assets.UrlConstant;
import com.kubi.assets.entity.HistoryRecordEntity;
import com.kubi.assets.withdraw.r6;
import com.kubi.host.HostManager;
import com.kubi.payment.channel.data.entities.ChannelKycRequest;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.router.core.Router;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.sensorsdata.abtest.entity.AppConstants;
import java.util.Arrays;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p637ta.C44825n2;
import p637ta.C44862s4;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.assets.history.f, reason: from Kotlin metadata */
/* JADX INFO: compiled from: HistoryHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fJ6\u0010\u0010\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fJ6\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\rH\u0002J\u001a\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/assets/history/HistoryHelper;", "", "<init>", "()V", "handleWithdrawRecordStatusTip", "", "binding", "Lcom/kubi/assets/databinding/KucoinFragmentInoutDeitalBinding;", "hisRecord", "Lcom/kubi/assets/entity/HistoryRecordEntity;", "checkoutStatus", "", "fromPageId", "", "fragment", "Lcom/kubi/assets/history/InOutDetailFragment;", "handleDepositRecordStatusTip", "pageId", "setClickSpan", "content", "clickStr", "handleTrComplianceInfoRedirect", "isWithDraw", "id", "handleWhtJump", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class HistoryHelper {
    /* JADX INFO: renamed from: h */
    public static final Unit m17322h(HistoryHelper historyHelper, HistoryRecordEntity historyRecordEntity) {
        historyHelper.m17326i(false, historyRecordEntity.id);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m17323l(HistoryHelper historyHelper, HistoryRecordEntity historyRecordEntity) {
        historyHelper.m17326i(true, historyRecordEntity.id);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:168:0x0333  */
    /* JADX WARN: Code duplicated, block: B:170:0x033f  */
    /* JADX WARN: Code duplicated, block: B:171:0x0341  */
    /* JADX WARN: Code duplicated, block: B:174:0x0354  */
    /* JADX WARN: Code duplicated, block: B:175:0x0356  */
    /* JADX WARN: Code duplicated, block: B:179:0x0383  */
    /* JADX WARN: Code duplicated, block: B:183:0x038c  */
    /* JADX WARN: Code duplicated, block: B:187:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:188:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:191:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:195:0x03dc  */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x010b, code lost:
    
        if (r1.equals("ROLLBACK") == false) goto L198;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m17325e(@Nullable C44862s4 c44862s4, @Nullable final HistoryRecordEntity historyRecordEntity, @Nullable String str, @Nullable String str2, @NotNull InOutDetailFragment fragment) {
        String string;
        BaseTextView baseTextView;
        CharSequence text;
        KcSecondaryButton kcSecondaryButton;
        KcSecondaryButton kcSecondaryButton2;
        KcSecondaryButton kcSecondaryButton3;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        LinearLayout linearLayout;
        BaseTextView baseTextView7;
        ProgressBar progressBar;
        BaseTextView baseTextView8;
        BaseTextView baseTextView9;
        BaseTextView baseTextView10;
        BaseTextView baseTextView11;
        BaseTextView baseTextView12;
        BaseTextView baseTextView13;
        BaseTextView baseTextView14;
        BaseTextView baseTextView15;
        BaseTextView baseTextView16;
        BaseTextView baseTextView17;
        TextPaint paint;
        BaseTextView baseTextView18;
        BaseTextView baseTextView19;
        BaseTextView baseTextView20;
        BaseTextView baseTextView21;
        KcSecondaryButton kcSecondaryButton4;
        BaseTextView baseTextView22;
        KcSecondaryButton kcSecondaryButton5;
        KcSecondaryButton kcSecondaryButton6;
        BaseTextView baseTextView23;
        LinearLayout linearLayout2;
        BaseTextView baseTextView24;
        ProgressBar progressBar2;
        Context context;
        Drawable drawable;
        BaseTextView baseTextView25;
        BaseTextView baseTextView26;
        BaseTextView baseTextView27;
        final HistoryHelper historyHelper = this;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        String str3 = historyRecordEntity != null ? historyRecordEntity.status : null;
        boolean z11 = true;
        if (str3 != null) {
            switch (str3.hashCode()) {
                case -1881019560:
                    if (str3.equals("REVIEW")) {
                        if (!Intrinsics.areEqual(historyRecordEntity.getIsShowOldAddressRisk(), Boolean.TRUE)) {
                            if (c44862s4 != null && (baseTextView26 = c44862s4.f100796B) != null) {
                                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                                String str4 = String.format(C27017c.f54310a.m66516f(R$string.deposit_detail_processing_content, new Object[0]), Arrays.copyOf(new Object[]{historyRecordEntity.getConfirmationStr(), historyRecordEntity.getConfirmationCountStr()}, 2));
                                Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
                                baseTextView26.setText(str4);
                            }
                            if (c44862s4 != null && (baseTextView25 = c44862s4.f100796B) != null) {
                                ViewExtKt.m66594y(baseTextView25);
                            }
                            if (c44862s4 != null && (progressBar2 = c44862s4.f100827j) != null) {
                                progressBar2.setMax(DowngradeExKt.m66543m(historyRecordEntity.getConfirmationCountStr(), 0, 1, null));
                                progressBar2.setProgress(DowngradeExKt.m66543m(historyRecordEntity.getConfirmationStr(), 0, 1, null));
                                context = fragment.getContext();
                                if (context != null) {
                                    drawable = ContextCompat.getDrawable(context, R$drawable.shape_detail_progressbar);
                                } else {
                                    drawable = null;
                                }
                                progressBar2.setProgressDrawable(drawable);
                            }
                            if (c44862s4 != null && (baseTextView24 = c44862s4.f100843z) != null) {
                                baseTextView24.setText(historyRecordEntity.getConfirmationStr() + '/' + historyRecordEntity.getConfirmationCountStr());
                            }
                            if (c44862s4 != null && (linearLayout2 = c44862s4.f100826i) != null) {
                                ViewExtKt.m66594y(linearLayout2);
                            }
                        } else if (c44862s4 != null && (baseTextView27 = c44862s4.f100796B) != null) {
                            AssetExKt.m15133u(baseTextView27, C27017c.f54310a.m66516f(R$string.asset_detail_tip10, new Object[0]));
                        }
                    }
                    break;
                case -1320377575:
                    if (str3.equals("WALLET_PROCESSING")) {
                        if (!Intrinsics.areEqual(historyRecordEntity.getIsShowOldAddressRisk(), Boolean.TRUE)) {
                            if (c44862s4 != null) {
                                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                                String str5 = String.format(C27017c.f54310a.m66516f(R$string.deposit_detail_processing_content, new Object[0]), Arrays.copyOf(new Object[]{historyRecordEntity.getConfirmationStr(), historyRecordEntity.getConfirmationCountStr()}, 2));
                                Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
                                baseTextView26.setText(str5);
                            }
                            if (c44862s4 != null) {
                                ViewExtKt.m66594y(baseTextView25);
                            }
                            if (c44862s4 != null) {
                                progressBar2.setMax(DowngradeExKt.m66543m(historyRecordEntity.getConfirmationCountStr(), 0, 1, null));
                                progressBar2.setProgress(DowngradeExKt.m66543m(historyRecordEntity.getConfirmationStr(), 0, 1, null));
                                context = fragment.getContext();
                                if (context != null) {
                                    drawable = ContextCompat.getDrawable(context, R$drawable.shape_detail_progressbar);
                                } else {
                                    drawable = null;
                                }
                                progressBar2.setProgressDrawable(drawable);
                            }
                            if (c44862s4 != null) {
                                baseTextView24.setText(historyRecordEntity.getConfirmationStr() + '/' + historyRecordEntity.getConfirmationCountStr());
                            }
                            if (c44862s4 != null) {
                                ViewExtKt.m66594y(linearLayout2);
                            }
                        } else if (c44862s4 != null) {
                            AssetExKt.m15133u(baseTextView27, C27017c.f54310a.m66516f(R$string.asset_detail_tip10, new Object[0]));
                        }
                    }
                    break;
                case -1149187101:
                    if (str3.equals(AppConstants.AB_TEST_SUCCESS)) {
                        if (c44862s4 != null && (baseTextView5 = c44862s4.f100796B) != null) {
                            baseTextView5.setText(C27017c.f54310a.m66516f(R$string.asset_detail_tip1, new Object[0]));
                        }
                        if (c44862s4 != null && (baseTextView4 = c44862s4.f100796B) != null) {
                            ViewExtKt.m66594y(baseTextView4);
                        }
                    }
                    break;
                case -847645549:
                    if (!str3.equals("RISK_MGT_REJECTED")) {
                        historyHelper = this;
                    } else {
                        C27017c c27017c = C27017c.f54310a;
                        String strM66516f = c27017c.m66516f(R$string.asset_contact_custom_service, new Object[0]);
                        Locale ENGLISH = Locale.ENGLISH;
                        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
                        String lowerCase = strM66516f.toLowerCase(ENGLISH);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                        String str6 = String.format(ENGLISH, c27017c.m66516f(R$string.asset_rollback_riskreject_detail, new Object[0]), Arrays.copyOf(new Object[]{lowerCase}, 1));
                        Intrinsics.checkNotNullExpressionValue(str6, "format(...)");
                        historyHelper = this;
                        historyHelper.m17329m(str6, lowerCase, fragment, c44862s4, str);
                    }
                    break;
                case -368591510:
                    if (str3.equals("FAILURE") && c44862s4 != null && (baseTextView6 = c44862s4.f100798D) != null) {
                        baseTextView6.setText("-/" + historyRecordEntity.getConfirmationCountStr());
                    }
                    historyHelper = this;
                    break;
                case 86970974:
                    if (str3.equals("ROLLBACKING")) {
                        if (historyRecordEntity.getIsArrears()) {
                            if (c44862s4 != null && (baseTextView19 = c44862s4.f100796B) != null) {
                                baseTextView19.setText(C27017c.f54310a.m66516f(R$string.asset_rollback_tip5, new Object[0]));
                            }
                            if (c44862s4 != null && (baseTextView18 = c44862s4.f100809O) != null) {
                                ViewExtKt.m66594y(baseTextView18);
                            }
                            if (c44862s4 != null && (baseTextView17 = c44862s4.f100809O) != null && (paint = baseTextView17.getPaint()) != null) {
                                paint.setFlags(8);
                            }
                            if (c44862s4 != null && (baseTextView16 = c44862s4.f100809O) != null) {
                                C27046k.m66711z(baseTextView16, 0L, new Function0() { // from class: com.kubi.assets.history.b
                                    @Override // p852kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return HistoryHelper.m17321g();
                                    }
                                }, 1, null);
                            }
                        } else if (c44862s4 != null && (baseTextView14 = c44862s4.f100796B) != null) {
                            baseTextView14.setText(C27017c.f54310a.m66516f(R$string.asset_rollback_tip4, new Object[0]));
                        }
                        if (c44862s4 != null && (baseTextView15 = c44862s4.f100796B) != null) {
                            ViewExtKt.m66594y(baseTextView15);
                        }
                    }
                    historyHelper = this;
                    break;
                case 92304935:
                    if (str3.equals("PRE_SUCCESS")) {
                        if (c44862s4 != null && (baseTextView9 = c44862s4.f100796B) != null) {
                            StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
                            String str7 = String.format(C27017c.f54310a.m66516f(R$string.deposit_detail_lock_content, new Object[0]), Arrays.copyOf(new Object[]{historyRecordEntity.getConfirmationCountStr()}, 1));
                            Intrinsics.checkNotNullExpressionValue(str7, "format(...)");
                            baseTextView9.setText(str7);
                        }
                        if (c44862s4 != null && (baseTextView8 = c44862s4.f100796B) != null) {
                            ViewExtKt.m66594y(baseTextView8);
                        }
                        if (c44862s4 != null && (progressBar = c44862s4.f100827j) != null) {
                            progressBar.setMax(DowngradeExKt.m66543m(historyRecordEntity.getConfirmationCountStr(), 0, 1, null));
                            progressBar.setProgress(DowngradeExKt.m66543m(historyRecordEntity.getConfirmationStr(), 0, 1, null));
                            Context context2 = fragment.getContext();
                            progressBar.setProgressDrawable(context2 != null ? ContextCompat.getDrawable(context2, R$drawable.shape_detail_progressbar_primary) : null);
                        }
                        if (c44862s4 != null && (baseTextView7 = c44862s4.f100843z) != null) {
                            baseTextView7.setText(historyRecordEntity.getConfirmationStr() + '/' + historyRecordEntity.getConfirmationCountStr());
                        }
                        if (c44862s4 != null && (linearLayout = c44862s4.f100826i) != null) {
                            ViewExtKt.m66594y(linearLayout);
                        }
                    }
                    historyHelper = this;
                    break;
                case 305498579:
                    if (str3.equals("TRM_MGT_REJECTED")) {
                        if (Intrinsics.areEqual(historyRecordEntity.getSubStatus(), "ROUTINE_RULE")) {
                            if (c44862s4 != null && (baseTextView13 = c44862s4.f100796B) != null) {
                                baseTextView13.setText(C27017c.f54310a.m66516f(R$string.kc_asset_deposit_rule_refuse, new Object[0]));
                            }
                            if (c44862s4 != null && (baseTextView12 = c44862s4.f100796B) != null) {
                                ViewExtKt.m66594y(baseTextView12);
                            }
                            C27017c c27017c2 = C27017c.f54310a;
                            m17324n(historyHelper, c27017c2.m66516f(R$string.kc_asset_deposit_rule_refuse, new Object[0]), c27017c2.m66516f(R$string.asset_contact_custom_service, new Object[0]), fragment, c44862s4, null, 16, null);
                        } else {
                            if (c44862s4 != null && (baseTextView11 = c44862s4.f100796B) != null) {
                                baseTextView11.setText(C27017c.f54310a.m66516f(R$string.asset_detail_tip9, new Object[0]));
                            }
                            if (c44862s4 != null && (baseTextView10 = c44862s4.f100796B) != null) {
                                ViewExtKt.m66594y(baseTextView10);
                            }
                        }
                        historyHelper = this;
                    }
                    break;
                case 522907364:
                    break;
                case 860367488:
                    if (str3.equals("WAIT_TRM_MGT")) {
                        String subStatus = historyRecordEntity.getSubStatus();
                        if (Intrinsics.areEqual(subStatus, "TRAVEL_RULE")) {
                            if (c44862s4 != null && (baseTextView23 = c44862s4.f100796B) != null) {
                                AssetExKt.m15133u(baseTextView23, C27017c.f54310a.m66516f(R$string.kc_tr_service_tip, new Object[0]));
                            }
                            if (!Intrinsics.areEqual(historyRecordEntity.getTravelRuleOrderStatus(), "pending")) {
                                if (c44862s4 != null && (kcSecondaryButton6 = c44862s4.f100811Q) != null) {
                                    ViewExtKt.m66594y(kcSecondaryButton6);
                                }
                                if (c44862s4 != null && (kcSecondaryButton5 = c44862s4.f100811Q) != null) {
                                    C27046k.m66711z(kcSecondaryButton5, 0L, new Function0() { // from class: com.kubi.assets.history.c
                                        @Override // p852kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return HistoryHelper.m17322h(this.f17648b, historyRecordEntity);
                                        }
                                    }, 1, null);
                                }
                            } else if (c44862s4 != null && (kcSecondaryButton4 = c44862s4.f100811Q) != null) {
                                ViewExtKt.m66577h(kcSecondaryButton4);
                            }
                            if (Intrinsics.areEqual(historyRecordEntity.getTravelRuleOrderStatus(), "pending") && c44862s4 != null && (baseTextView22 = c44862s4.f100796B) != null) {
                                AssetExKt.m15133u(baseTextView22, C27017c.f54310a.m66516f(R$string.kc_assets_travelrule_pending_des, new Object[0]));
                            }
                        } else if (!Intrinsics.areEqual(subStatus, "ROUTINE_RULE")) {
                            FragmentActivity activity = fragment.getActivity();
                            if (activity != null) {
                                C27017c c27017c3 = C27017c.f54310a;
                                InOutDetailFragment.C10133a c10133a = new InOutDetailFragment.C10133a(activity, c27017c3.m66512a(R$color.primary), C27041f.m66668h(str));
                                if (c44862s4 != null && (baseTextView20 = c44862s4.f100796B) != null) {
                                    ViewExtKt.m66594y(baseTextView20);
                                    baseTextView20.setText(c27017c3.m66516f(R$string.asset_detail_tip8, new Object[0]));
                                    baseTextView20.setMovementMethod(LinkMovementMethod.getInstance());
                                    baseTextView20.setHighlightColor(0);
                                    HighlightTextHelper.f43497a.m54116a(baseTextView20, HighlightTextHelper.TextTagEnum.SPAN, c10133a);
                                }
                            }
                        } else if (c44862s4 != null && (baseTextView21 = c44862s4.f100796B) != null) {
                            AssetExKt.m15133u(baseTextView21, C27017c.f54310a.m66516f(R$string.kc_asset_deposit_wait_trm_rule, new Object[0]));
                        }
                    }
                    break;
                case 907287315:
                    if (str3.equals("PROCESSING")) {
                        if (!Intrinsics.areEqual(historyRecordEntity.getIsShowOldAddressRisk(), Boolean.TRUE)) {
                            if (c44862s4 != null) {
                                StringCompanionObject stringCompanionObject5 = StringCompanionObject.INSTANCE;
                                String str8 = String.format(C27017c.f54310a.m66516f(R$string.deposit_detail_processing_content, new Object[0]), Arrays.copyOf(new Object[]{historyRecordEntity.getConfirmationStr(), historyRecordEntity.getConfirmationCountStr()}, 2));
                                Intrinsics.checkNotNullExpressionValue(str8, "format(...)");
                                baseTextView26.setText(str8);
                            }
                            if (c44862s4 != null) {
                                ViewExtKt.m66594y(baseTextView25);
                            }
                            if (c44862s4 != null) {
                                progressBar2.setMax(DowngradeExKt.m66543m(historyRecordEntity.getConfirmationCountStr(), 0, 1, null));
                                progressBar2.setProgress(DowngradeExKt.m66543m(historyRecordEntity.getConfirmationStr(), 0, 1, null));
                                context = fragment.getContext();
                                if (context != null) {
                                    drawable = ContextCompat.getDrawable(context, R$drawable.shape_detail_progressbar);
                                } else {
                                    drawable = null;
                                }
                                progressBar2.setProgressDrawable(drawable);
                            }
                            if (c44862s4 != null) {
                                baseTextView24.setText(historyRecordEntity.getConfirmationStr() + '/' + historyRecordEntity.getConfirmationCountStr());
                            }
                            if (c44862s4 != null) {
                                ViewExtKt.m66594y(linearLayout2);
                            }
                        } else if (c44862s4 != null) {
                            AssetExKt.m15133u(baseTextView27, C27017c.f54310a.m66516f(R$string.asset_detail_tip10, new Object[0]));
                        }
                    }
                    break;
            }
        }
        if (historyRecordEntity != null ? Intrinsics.areEqual(Boolean.TRUE, historyRecordEntity.getNeedSubmitWht()) : false) {
            if (c44862s4 != null && (baseTextView3 = c44862s4.f100796B) != null) {
                AssetExKt.m15133u(baseTextView3, C27017c.f54310a.m66516f(R$string.kc_wht_provider_desc, new Object[0]));
            }
            if (c44862s4 != null && (baseTextView2 = c44862s4.f100796B) != null) {
                AssetExKt.m15127o(baseTextView2, R$color.c_text);
            }
            if (c44862s4 != null && (kcSecondaryButton3 = c44862s4.f100811Q) != null) {
                kcSecondaryButton3.setText(C27017c.f54310a.m66516f(R$string.kc_wht_provider_button_title, new Object[0]));
            }
            if (c44862s4 != null && (kcSecondaryButton2 = c44862s4.f100811Q) != null) {
                ViewExtKt.m66594y(kcSecondaryButton2);
            }
            if (c44862s4 != null && (kcSecondaryButton = c44862s4.f100811Q) != null) {
                C27046k.m66711z(kcSecondaryButton, 0L, new Function0() { // from class: com.kubi.assets.history.d
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HistoryHelper.m17320f(this.f17652b, historyRecordEntity);
                    }
                }, 1, null);
            }
        }
        r6 r6Var = r6.a;
        String str9 = historyRecordEntity != null ? historyRecordEntity.status : null;
        String str10 = historyRecordEntity != null ? historyRecordEntity.code : null;
        String chainId = historyRecordEntity != null ? historyRecordEntity.getChainId() : null;
        String memo = historyRecordEntity != null ? historyRecordEntity.getMemo() : null;
        if (memo != null && memo.length() != 0) {
            z11 = false;
        }
        String str11 = z11 ? "0" : "1";
        String strValueOf = String.valueOf(System.currentTimeMillis() - (historyRecordEntity != null ? historyRecordEntity.getTime() : 0L));
        if (c44862s4 == null || (baseTextView = c44862s4.f100836s) == null || (text = baseTextView.getText()) == null || (string = text.toString()) == null) {
            string = "";
        }
        r6Var.o(str2, str9, str10, chainId, str11, strValueOf, string);
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m17321g() {
        Router.f46192a.m56184f(UrlConstant.f16608a.m15459b()).m4048k();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m17324n(HistoryHelper historyHelper, String str, String str2, InOutDetailFragment inOutDetailFragment, C44862s4 c44862s4, String str3, int i11, Object obj) {
        if ((i11 & 16) != 0) {
            str3 = null;
        }
        historyHelper.m17329m(str, str2, inOutDetailFragment, c44862s4, str3);
    }

    /* JADX INFO: renamed from: i */
    public final void m17326i(boolean z11, String str) {
        Router.f46192a.m56184f(HostManager.a.m() + "/assets/travel-rule/info?type=" + (z11 ? ChannelKycRequest.SCENE_WITHDRAW : ChannelKycRequest.SCENE_DEPOSIT) + "&id=" + str + "&appNeedLang=true").m4048k();
    }

    /* JADX INFO: renamed from: j */
    public final void m17327j(HistoryRecordEntity historyRecordEntity) {
        Router.f46192a.m56184f(HostManager.a.m() + "/assets/wht?depositId=" + historyRecordEntity.id + "&costValue=" + historyRecordEntity.amount + "&costCurrency=" + historyRecordEntity.code + "&needLogin=true&loading=2&appNeedLang=true").m4048k();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:99:0x0173  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        com.kubi.assets.AssetExKt.m15138z(r0, !r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        if (r25 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
    
        r0.setText(com.kubi.utils.C27017c.f54310a.m66516f(com.kubi.assets.R$string.asset_detail_tip7, new java.lang.Object[0]));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        if (r25 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006d, code lost:
    
        com.kubi.utils.extensions.core.ViewExtKt.m66594y(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0078, code lost:
    
        if (r0.equals("RISK_MGT_REJECTED") != true) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ae, code lost:
    
        if (r0.equals("WALLET_FAILURE") != true) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c5, code lost:
    
        if (r25 != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00cb, code lost:
    
        com.kubi.assets.AssetExKt.m15138z(r0, !r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d0, code lost:
    
        if (r25 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00da, code lost:
    
        r0.setText(com.kubi.utils.C27017c.f54310a.m66516f(com.kubi.assets.R$string.asset_detail_tip5, new java.lang.Object[0]));
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e7, code lost:
    
        if (r25 != null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f1, code lost:
    
        com.kubi.utils.extensions.core.ViewExtKt.m66594y(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f4, code lost:
    
        r0 = "wallet reject";
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00fb, code lost:
    
        if (r0.equals("WALLET_PROCESSING") != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0112, code lost:
    
        if (r25 != null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0118, code lost:
    
        com.kubi.assets.AssetExKt.m15138z(r0, !r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x011d, code lost:
    
        if (r25 != null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0127, code lost:
    
        r0.setText(com.kubi.utils.C27017c.f54310a.m66516f(com.kubi.assets.R$string.asset_detail_tip4, new java.lang.Object[0]));
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0134, code lost:
    
        if (r25 != null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x013e, code lost:
    
        com.kubi.utils.extensions.core.ViewExtKt.m66594y(r0);
     */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v87 com.kubi.resources.widget.BaseTextView, still in use, count: 1, list:
      (r0v87 com.kubi.resources.widget.BaseTextView) from 0x0049: INVOKE 
      (r0v87 com.kubi.resources.widget.BaseTextView)
      (wrap boolean:0x0047: ARITH (r27v0 boolean) ^ true A[WRAPPED] (LINE:73))
     STATIC call: com.kubi.assets.AssetExKt.z(android.view.View, boolean):void A[MD:(android.view.View, boolean):void (m), REMOVE] (LINE:76)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.unbindArgUsage(InsnRemover.java:176)
    	at jadx.core.utils.InsnRemover.unbindAllArgs(InsnRemover.java:108)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$0(InsnRemover.java:99)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:99)
    	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
    	at jadx.core.utils.InsnRemover.removeAllMarked(InsnRemover.java:276)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:354)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m17328k(@Nullable C44862s4 c44862s4, @Nullable final HistoryRecordEntity historyRecordEntity, boolean z11, @Nullable String str, @NotNull InOutDetailFragment fragment) {
        String str2;
        String str3;
        BaseTextView baseTextView;
        CharSequence text;
        String string;
        BaseTextView baseTextView2;
        C44825n2 c44825n2;
        BaseTextView baseTextView3;
        C44825n2 c44825n3;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        KcSecondaryButton kcSecondaryButton;
        BaseTextView baseTextView7;
        KcSecondaryButton kcSecondaryButton2;
        KcSecondaryButton kcSecondaryButton3;
        BaseTextView baseTextView8;
        BaseTextView baseTextView9;
        BaseTextView baseTextView10;
        BaseTextView baseTextView11;
        BaseTextView baseTextView12;
        BaseTextView baseTextView13;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        String promptType = historyRecordEntity != null ? historyRecordEntity.getPromptType() : null;
        if (promptType != null) {
            switch (promptType) {
                case "WAIT_RISK_MGT":
                    C27017c c27017c = C27017c.f54310a;
                    m17324n(this, c27017c.m66516f(R$string.asset_detail_tip3, new Object[0]), c27017c.m66516f(R$string.asset_contact_custom_service, new Object[0]), fragment, c44862s4, null, 16, null);
                    if (c44862s4 != null && (baseTextView9 = c44862s4.f100796B) != null) {
                        AssetExKt.m15138z(baseTextView9, !z11);
                    }
                case "WALLET_PROCESSING":
                    if (c44862s4 != null && (baseTextView10 = c44862s4.f100796B) != null) {
                        baseTextView10.setText(C27017c.f54310a.m66516f(R$string.asset_detail_tip4, new Object[0]));
                    }
                case "WALLET_FAILURE":
                    if (c44862s4 != null && (baseTextView11 = c44862s4.f100796B) != null) {
                        baseTextView11.setText(C27017c.f54310a.m66516f(R$string.asset_detail_tip5, new Object[0]));
                    }
                case "RISK_MGT_REJECTED":
                    C27017c c27017c2 = C27017c.f54310a;
                    m17324n(this, c27017c2.m66516f(R$string.asset_detail_tip6, new Object[0]), c27017c2.m66516f(R$string.asset_contact_custom_service, new Object[0]), fragment, c44862s4, null, 16, null);
                    if (c44862s4 != null && (baseTextView12 = c44862s4.f100796B) != null) {
                        AssetExKt.m15138z(baseTextView12, !z11);
                    }
                    String str4 = "review reject";
                    str2 = str4;
                    break;
                case "PROCESSING":
                    if (c44862s4 != null && (baseTextView13 = c44862s4.f100796B) != null) {
                        baseTextView13.setText(C27017c.f54310a.m66516f(R$string.asset_detail_tip7, new Object[0]));
                    }
                default:
                    if (promptType.equals("WAIT_RISK_MGT")) {
                        C27017c c27017c3 = C27017c.f54310a;
                        m17324n(this, c27017c3.m66516f(R$string.asset_detail_tip3, new Object[0]), c27017c3.m66516f(R$string.asset_contact_custom_service, new Object[0]), fragment, c44862s4, null, 16, null);
                        if (c44862s4 != null && (baseTextView9 = c44862s4.f100796B) != null) {
                            AssetExKt.m15138z(baseTextView9, !z11);
                        }
                    }
                    str2 = "";
                    break;
            }
        } else {
            str2 = "";
        }
        if (Intrinsics.areEqual(historyRecordEntity != null ? historyRecordEntity.getSubStatus() : null, "COMPLIANCE_PENDING")) {
            if (c44862s4 != null && (baseTextView8 = c44862s4.f100796B) != null) {
                AssetExKt.m15133u(baseTextView8, C27017c.f54310a.m66516f(R$string.kc_tr_service_tip, new Object[0]));
            }
            if (!Intrinsics.areEqual(historyRecordEntity != null ? historyRecordEntity.getTravelRuleOrderStatus() : null, "pending")) {
                if (c44862s4 != null && (kcSecondaryButton3 = c44862s4.f100811Q) != null) {
                    ViewExtKt.m66594y(kcSecondaryButton3);
                }
                if (c44862s4 != null && (kcSecondaryButton2 = c44862s4.f100811Q) != null) {
                    C27046k.m66711z(kcSecondaryButton2, 0L, new Function0() { // from class: com.kubi.assets.history.e
                        @Override // p852kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HistoryHelper.m17323l(this.f17658b, historyRecordEntity);
                        }
                    }, 1, null);
                }
            } else if (c44862s4 != null && (kcSecondaryButton = c44862s4.f100811Q) != null) {
                ViewExtKt.m66577h(kcSecondaryButton);
            }
            if (Intrinsics.areEqual(historyRecordEntity != null ? historyRecordEntity.getTravelRuleOrderStatus() : null, "pending") && c44862s4 != null && (baseTextView7 = c44862s4.f100796B) != null) {
                AssetExKt.m15133u(baseTextView7, C27017c.f54310a.m66516f(R$string.kc_assets_travelrule_pending_des, new Object[0]));
            }
        }
        if (TextUtils.isEmpty(historyRecordEntity != null ? historyRecordEntity.getFailureReasonMsg() : null)) {
            str3 = "default";
        } else {
            if (c44862s4 != null && (baseTextView6 = c44862s4.f100796B) != null) {
                baseTextView6.setText(historyRecordEntity != null ? historyRecordEntity.getFailureReasonMsg() : null);
            }
            if (c44862s4 != null && (baseTextView5 = c44862s4.f100796B) != null) {
                ViewExtKt.m66594y(baseTextView5);
            }
            if (Intrinsics.areEqual(historyRecordEntity != null ? historyRecordEntity.getPromptType() : null, "WALLET_PROCESSING")) {
                if (c44862s4 != null && (c44825n3 = c44862s4.f100817W) != null && (baseTextView4 = c44825n3.f100498j) != null) {
                    baseTextView4.setText(historyRecordEntity != null ? historyRecordEntity.getFailureReasonMsg() : null);
                }
                if (c44862s4 != null && (c44825n2 = c44862s4.f100817W) != null && (baseTextView3 = c44825n2.f100498j) != null) {
                    ViewExtKt.m66594y(baseTextView3);
                }
                if (c44862s4 != null && (baseTextView2 = c44862s4.f100796B) != null) {
                    AssetExKt.m15138z(baseTextView2, false);
                }
            }
            str3 = "assign";
        }
        String str5 = str3;
        r6 r6Var = r6.a;
        String str6 = historyRecordEntity != null ? historyRecordEntity.status : null;
        String str7 = historyRecordEntity != null ? historyRecordEntity.code : null;
        String chainId = historyRecordEntity != null ? historyRecordEntity.getChainId() : null;
        String memo = historyRecordEntity != null ? historyRecordEntity.getMemo() : null;
        r6Var.u(str, str6, str2, str5, str7, chainId, (memo == null || memo.length() == 0) ? "0" : "1", String.valueOf(System.currentTimeMillis() - (historyRecordEntity != null ? historyRecordEntity.getTime() : 0L)), TextUtils.isEmpty(historyRecordEntity != null ? historyRecordEntity.getChainId() : null) ? "contact" : "address", (c44862s4 == null || (baseTextView = c44862s4.f100836s) == null || (text = baseTextView.getText()) == null || (string = text.toString()) == null) ? "" : string);
    }

    /* JADX INFO: renamed from: m */
    public final void m17329m(String str, String str2, InOutDetailFragment inOutDetailFragment, C44862s4 c44862s4, String str3) {
        C44825n2 c44825n2;
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        C44825n2 c44825n3;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        if (c44862s4 != null && (baseTextView4 = c44862s4.f100796B) != null) {
            ViewExtKt.m66594y(baseTextView4);
        }
        if (c44862s4 != null && (c44825n3 = c44862s4.f100817W) != null && (baseTextView3 = c44825n3.f100498j) != null) {
            ViewExtKt.m66594y(baseTextView3);
        }
        SpannableString spannableString = new SpannableString(str);
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) spannableString, str2, 0, true, 2, (Object) null);
        int length = str2.length();
        if (iIndexOf$default < 0) {
            length = str.length();
            iIndexOf$default = 0;
        }
        FragmentActivity activity = inOutDetailFragment.getActivity();
        spannableString.setSpan(activity != null ? new InOutDetailFragment.C10133a(activity, C27017c.f54310a.m66512a(R$color.primary), C27041f.m66668h(str3)) : null, iIndexOf$default, length + iIndexOf$default, 17);
        if (c44862s4 != null && (baseTextView2 = c44862s4.f100796B) != null) {
            baseTextView2.setMovementMethod(LinkMovementMethod.getInstance());
            baseTextView2.setHighlightColor(0);
            baseTextView2.setText(spannableString);
        }
        if (c44862s4 == null || (c44825n2 = c44862s4.f100817W) == null || (baseTextView = c44825n2.f100498j) == null) {
            return;
        }
        baseTextView.setMovementMethod(LinkMovementMethod.getInstance());
        baseTextView.setHighlightColor(0);
        baseTextView.setText(spannableString);
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m17320f(HistoryHelper historyHelper, HistoryRecordEntity historyRecordEntity) {
        historyHelper.m17327j(historyRecordEntity);
        return Unit.INSTANCE;
    }
}
