package com.kubi.assets.utils;

import android.annotation.SuppressLint;
import androidx.webkit.ProxyConfig;
import com.facebook.react.devsupport.StackTraceHelper;
import com.kubi.assets.AssetsLog;
import com.kubi.assets.exception.AssetsMessage;
import com.kubi.utils.extensions.DowngradeExKt;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import com.tencent.bugly.proguard.C33820nf;
import io.flutter.plugin.editing.SpellCheckPlugin;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.CharsKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: Calculator.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0018\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0003J\u0018\u0010\f\u001a\u0004\u0018\u00010\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0002J\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\"\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0017H\u0002J0\u0010\u0018\u001a\u00020\u00122\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u001a2\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u001cH\u0002J\u0016\u0010\u001d\u001a\u00020\u00122\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u001aH\u0002J0\u0010\u001e\u001a\u00020\u00122\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u001a2\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u001cH\u0002¨\u0006 "}, m90084d2 = {"Lcom/kubi/assets/utils/Calculator;", "", "<init>", "()V", "calculate", "Ljava/math/BigDecimal;", "expression", "", "tokenizeExpression", "", "convertToPostfix", "infix", "evaluatePostfix", "postfix", "readFunctionName", SpellCheckPlugin.START_INDEX_KEY, "", "flushBufferToResult", "", "numberBuffer", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", DbParams.KEY_CHANNEL_RESULT, "", "applyOperator", StackTraceHelper.STACK_KEY, "Ljava/util/Stack;", "operation", "Lkotlin/Function2;", "applyOperatorWithDivision", "applyFunction", "function", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCalculator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Calculator.kt\ncom/kubi/assets/utils/Calculator\n+ 2 AssetsIssue.kt\ncom/kubi/assets/exception/AssetsIssueKt\n*L\n1#1,254:1\n48#2,2:255\n*S KotlinDebug\n*F\n+ 1 Calculator.kt\ncom/kubi/assets/utils/Calculator\n*L\n31#1:255,2\n*E\n"})
public final class Calculator {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final Calculator f19060a = new Calculator();

    @Nullable
    /* JADX INFO: renamed from: d */
    public final BigDecimal m19900d(@NotNull String expression) {
        Object objM103844constructorimpl;
        List<String> listM19901e;
        Intrinsics.checkNotNullParameter(expression, "expression");
        try {
            Result.Companion companion = Result.INSTANCE;
            Calculator calculator = f19060a;
            List<String> listM19905i = calculator.m19905i(expression);
            if (listM19905i == null || (listM19901e = calculator.m19901e(listM19905i)) == null) {
                return null;
            }
            objM103844constructorimpl = Result.m103844constructorimpl(calculator.m19902f(listM19901e));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C43846g.m96568c(new AssetsMessage("Error occurred during calculation: " + thM103847exceptionOrNullimpl.getMessage(), "Calculator", false, 4, null), null, 2, null);
        }
        return (BigDecimal) (Result.m103850isFailureimpl(objM103844constructorimpl) ? null : objM103844constructorimpl);
    }

    @SuppressLint({"KCCyclomaticComplexityCheck"})
    /* JADX INFO: renamed from: e */
    public final List<String> m19901e(List<String> list) {
        ArrayList arrayList = new ArrayList();
        Stack stack = new Stack();
        for (String str : list) {
            if (StringsKt.toBigDecimalOrNull(str) != null) {
                arrayList.add(str);
            } else if (Intrinsics.areEqual(str, "+") || Intrinsics.areEqual(str, C33820nf.f71144W)) {
                while (!stack.isEmpty()) {
                    Object objPeek = stack.peek();
                    Intrinsics.checkNotNullExpressionValue(objPeek, "peek(...)");
                    if (!StringsKt.contains$default((CharSequence) "+-*/", (CharSequence) objPeek, false, 2, (Object) null)) {
                        break;
                    }
                    Object objPop = stack.pop();
                    Intrinsics.checkNotNullExpressionValue(objPop, "pop(...)");
                    arrayList.add(objPop);
                }
                stack.push(str);
            } else if (Intrinsics.areEqual(str, ProxyConfig.MATCH_ALL_SCHEMES) || Intrinsics.areEqual(str, "/")) {
                while (!stack.isEmpty()) {
                    Object objPeek2 = stack.peek();
                    Intrinsics.checkNotNullExpressionValue(objPeek2, "peek(...)");
                    if (!StringsKt.contains$default((CharSequence) "*/", (CharSequence) objPeek2, false, 2, (Object) null)) {
                        break;
                    }
                    Object objPop2 = stack.pop();
                    Intrinsics.checkNotNullExpressionValue(objPop2, "pop(...)");
                    arrayList.add(objPop2);
                }
                stack.push(str);
            } else if (Intrinsics.areEqual(str, "(")) {
                stack.push(str);
            } else if (Intrinsics.areEqual(str, ")")) {
                while (!stack.isEmpty() && !Intrinsics.areEqual(stack.peek(), "(")) {
                    Object objPop3 = stack.pop();
                    Intrinsics.checkNotNullExpressionValue(objPop3, "pop(...)");
                    arrayList.add(objPop3);
                }
                if (!stack.isEmpty()) {
                    stack.pop();
                }
                if (!stack.isEmpty() && (Intrinsics.areEqual(stack.peek(), "min") || Intrinsics.areEqual(stack.peek(), "max"))) {
                    Object objPop4 = stack.pop();
                    Intrinsics.checkNotNullExpressionValue(objPop4, "pop(...)");
                    arrayList.add(objPop4);
                }
                Unit unit = Unit.INSTANCE;
            } else if (Intrinsics.areEqual(str, "min") || Intrinsics.areEqual(str, "max")) {
                stack.push(str);
            } else {
                if (!Intrinsics.areEqual(str, ",")) {
                    AssetsLog.Withdraw.m15236i("Unknown token during infix to postfix conversion: " + str);
                    return null;
                }
                while (!stack.isEmpty() && !Intrinsics.areEqual(stack.peek(), "(")) {
                    Object objPop5 = stack.pop();
                    Intrinsics.checkNotNullExpressionValue(objPop5, "pop(...)");
                    arrayList.add(objPop5);
                }
                Unit unit2 = Unit.INSTANCE;
            }
        }
        while (!stack.isEmpty()) {
            Object objPop6 = stack.pop();
            Intrinsics.checkNotNullExpressionValue(objPop6, "pop(...)");
            arrayList.add(objPop6);
        }
        AssetsLog.Withdraw.m15236i("Infix to Postfix result: " + arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public final BigDecimal m19902f(List<String> list) {
        Stack<BigDecimal> stack = new Stack<>();
        for (String str : list) {
            if (StringsKt.toBigDecimalOrNull(str) != null) {
                stack.push(DowngradeExKt.m66535e(str, null, 1, null));
            } else if (Intrinsics.areEqual(str, "+")) {
                m19898b(stack, Calculator$evaluatePostfix$1.INSTANCE);
            } else if (Intrinsics.areEqual(str, C33820nf.f71144W)) {
                m19898b(stack, Calculator$evaluatePostfix$2.INSTANCE);
            } else if (Intrinsics.areEqual(str, ProxyConfig.MATCH_ALL_SCHEMES)) {
                m19898b(stack, Calculator$evaluatePostfix$3.INSTANCE);
            } else if (Intrinsics.areEqual(str, "/")) {
                m19899c(stack);
            } else if (Intrinsics.areEqual(str, "min")) {
                m19897a(stack, Calculator$evaluatePostfix$4.INSTANCE);
            } else {
                if (!Intrinsics.areEqual(str, "max")) {
                    AssetsLog.Withdraw.m15236i("Unknown token during postfix evaluation: " + str);
                    return null;
                }
                m19897a(stack, Calculator$evaluatePostfix$5.INSTANCE);
            }
        }
        return stack.size() == 1 ? stack.pop() : BigDecimal.ZERO;
    }

    /* JADX INFO: renamed from: h */
    public final String m19904h(String str, int i11) {
        StringBuilder sb2 = new StringBuilder();
        while (i11 < str.length() && Character.isLetter(str.charAt(i11))) {
            sb2.append(str.charAt(i11));
            i11++;
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: i */
    public final List<String> m19905i(String str) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        int length = 0;
        while (length < str.length()) {
            char cCharAt = str.charAt(length);
            if (!CharsKt.isWhitespace(cCharAt)) {
                if (Character.isDigit(cCharAt) || cCharAt == '.') {
                    sb2.append(cCharAt);
                } else if (Character.isLetter(cCharAt)) {
                    m19903g(sb2, arrayList);
                    String strM19904h = m19904h(str, length);
                    if (!Intrinsics.areEqual(strM19904h, "min") && !Intrinsics.areEqual(strM19904h, "max")) {
                        AssetsLog.Withdraw.m15236i("Unknown function: " + strM19904h);
                        return null;
                    }
                    arrayList.add(strM19904h);
                    length += strM19904h.length() - 1;
                } else if (cCharAt == ',') {
                    m19903g(sb2, arrayList);
                    arrayList.add(",");
                } else {
                    if (!StringsKt.contains$default((CharSequence) "+-*/()", cCharAt, false, 2, (Object) null)) {
                        AssetsLog.Withdraw.m15236i("Invalid character encountered: " + cCharAt);
                        return null;
                    }
                    m19903g(sb2, arrayList);
                    arrayList.add(String.valueOf(cCharAt));
                }
            }
            length++;
        }
        m19903g(sb2, arrayList);
        AssetsLog.Withdraw.m15236i("Resolved string to tokens: " + arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final void m19897a(Stack<BigDecimal> stack, Function2<? super BigDecimal, ? super BigDecimal, ? extends BigDecimal> function2) {
        if (stack.size() < 2) {
            AssetsLog.Withdraw.m15236i("Not enough arguments for function");
            return;
        }
        BigDecimal bigDecimalPop = stack.pop();
        BigDecimal bigDecimalPop2 = stack.pop();
        Intrinsics.checkNotNull(bigDecimalPop2);
        Intrinsics.checkNotNull(bigDecimalPop);
        stack.push(function2.invoke(bigDecimalPop2, bigDecimalPop));
    }

    /* JADX INFO: renamed from: b */
    public final void m19898b(Stack<BigDecimal> stack, Function2<? super BigDecimal, ? super BigDecimal, ? extends BigDecimal> function2) {
        if (stack.size() < 2) {
            AssetsLog.Withdraw.m15236i("Not enough arguments for operator");
            return;
        }
        BigDecimal bigDecimalPop = stack.pop();
        BigDecimal bigDecimalPop2 = stack.pop();
        Intrinsics.checkNotNull(bigDecimalPop2);
        Intrinsics.checkNotNull(bigDecimalPop);
        stack.push(function2.invoke(bigDecimalPop2, bigDecimalPop));
    }

    /* JADX INFO: renamed from: c */
    public final void m19899c(Stack<BigDecimal> stack) {
        if (stack.size() < 2) {
            AssetsLog.Withdraw.m15236i("Not enough arguments for division");
        } else {
            stack.push(stack.pop().divide(stack.pop(), 20, RoundingMode.DOWN));
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m19903g(StringBuilder sb2, List<String> list) {
        if (sb2.length() > 0) {
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            list.add(string);
            StringsKt.clear(sb2);
        }
    }
}
