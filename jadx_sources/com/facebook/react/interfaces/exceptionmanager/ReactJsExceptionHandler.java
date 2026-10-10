package com.facebook.react.interfaces.exceptionmanager;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.common.annotations.UnstableReactNativeAPI;
import com.facebook.react.devsupport.StackTraceHelper;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReactJsExceptionHandler.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bç\u0080\u0001\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m90084d2 = {"Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler;", "", "reportJsException", "", "errorMap", "Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedError;", "ParsedError", "ParsedStackFrameImpl", "ParsedErrorImpl", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@UnstableReactNativeAPI
public interface ReactJsExceptionHandler {

    /* JADX INFO: compiled from: ReactJsExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0001\u001cR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0012\u0010\u0015\u001a\u00020\u0016X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0017R\u0012\u0010\u0018\u001a\u00020\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001dÀ\u0006\u0001"}, m90084d2 = {"Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedError;", "", "message", "", "getMessage", "()Ljava/lang/String;", StackTraceHelper.ORIGINAL_MESSAGE_KEY, "getOriginalMessage", "name", "getName", StackTraceHelper.COMPONENT_STACK_KEY, "getComponentStack", StackTraceHelper.STACK_KEY, "", "Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedError$StackFrame;", "getStack", "()Ljava/util/List;", "id", "", "getId", "()I", StackTraceHelper.IS_FATAL_KEY, "", "()Z", "extraData", "Lcom/facebook/react/bridge/ReadableMap;", "getExtraData", "()Lcom/facebook/react/bridge/ReadableMap;", "StackFrame", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public interface ParsedError {

        /* JADX INFO: compiled from: ReactJsExceptionHandler.kt */
        @Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, m90084d2 = {"Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedError$StackFrame;", "", "file", "", "getFile", "()Ljava/lang/String;", "methodName", "getMethodName", "lineNumber", "", "getLineNumber", "()Ljava/lang/Integer;", "column", "getColumn", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
        public interface StackFrame {
            @Nullable
            Integer getColumn();

            @Nullable
            String getFile();

            @Nullable
            Integer getLineNumber();

            @NotNull
            String getMethodName();
        }

        @Nullable
        String getComponentStack();

        @NotNull
        ReadableMap getExtraData();

        int getId();

        @NotNull
        String getMessage();

        @Nullable
        String getName();

        @Nullable
        String getOriginalMessage();

        @NotNull
        List<StackFrame> getStack();

        boolean isFatal();
    }

    /* JADX INFO: compiled from: ReactJsExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0083\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\t\u0010$\u001a\u00020\rHÆ\u0003J\t\u0010%\u001a\u00020\u000fHÆ\u0003Je\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010'\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\u000bHÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001bR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006,"}, m90084d2 = {"Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedErrorImpl;", "Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedError;", "message", "", StackTraceHelper.ORIGINAL_MESSAGE_KEY, "name", StackTraceHelper.COMPONENT_STACK_KEY, StackTraceHelper.STACK_KEY, "Ljava/util/ArrayList;", "Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedStackFrameImpl;", "id", "", StackTraceHelper.IS_FATAL_KEY, "", "extraData", "Lcom/facebook/react/bridge/ReadableNativeMap;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;IZLcom/facebook/react/bridge/ReadableNativeMap;)V", "getMessage", "()Ljava/lang/String;", "getOriginalMessage", "getName", "getComponentStack", "getStack", "()Ljava/util/ArrayList;", "getId", "()I", "()Z", "getExtraData", "()Lcom/facebook/react/bridge/ReadableNativeMap;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "toString", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final /* data */ class ParsedErrorImpl implements ParsedError {

        @Nullable
        private final String componentStack;

        @NotNull
        private final ReadableNativeMap extraData;
        private final int id;
        private final boolean isFatal;

        @NotNull
        private final String message;

        @Nullable
        private final String name;

        @Nullable
        private final String originalMessage;

        @NotNull
        private final ArrayList<ParsedStackFrameImpl> stack;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ParsedErrorImpl)) {
                return false;
            }
            ParsedErrorImpl parsedErrorImpl = (ParsedErrorImpl) other;
            return Intrinsics.areEqual(this.message, parsedErrorImpl.message) && Intrinsics.areEqual(this.originalMessage, parsedErrorImpl.originalMessage) && Intrinsics.areEqual(this.name, parsedErrorImpl.name) && Intrinsics.areEqual(this.componentStack, parsedErrorImpl.componentStack) && Intrinsics.areEqual(this.stack, parsedErrorImpl.stack) && this.id == parsedErrorImpl.id && this.isFatal == parsedErrorImpl.isFatal && Intrinsics.areEqual(this.extraData, parsedErrorImpl.extraData);
        }

        public ParsedErrorImpl(@NotNull String message, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull ArrayList<ParsedStackFrameImpl> stack, int i11, boolean z11, @NotNull ReadableNativeMap extraData) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(stack, "stack");
            Intrinsics.checkNotNullParameter(extraData, "extraData");
            this.message = message;
            this.originalMessage = str;
            this.name = str2;
            this.componentStack = str3;
            this.stack = stack;
            this.id = i11;
            this.isFatal = z11;
            this.extraData = extraData;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ParsedErrorImpl copy$default(ParsedErrorImpl parsedErrorImpl, String str, String str2, String str3, String str4, ArrayList arrayList, int i11, boolean z11, ReadableNativeMap readableNativeMap, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = parsedErrorImpl.message;
            }
            if ((i12 & 2) != 0) {
                str2 = parsedErrorImpl.originalMessage;
            }
            if ((i12 & 4) != 0) {
                str3 = parsedErrorImpl.name;
            }
            if ((i12 & 8) != 0) {
                str4 = parsedErrorImpl.componentStack;
            }
            if ((i12 & 16) != 0) {
                arrayList = parsedErrorImpl.stack;
            }
            if ((i12 & 32) != 0) {
                i11 = parsedErrorImpl.id;
            }
            if ((i12 & 64) != 0) {
                z11 = parsedErrorImpl.isFatal;
            }
            if ((i12 & 128) != 0) {
                readableNativeMap = parsedErrorImpl.extraData;
            }
            boolean z12 = z11;
            ReadableNativeMap readableNativeMap2 = readableNativeMap;
            ArrayList arrayList2 = arrayList;
            int i13 = i11;
            return parsedErrorImpl.copy(str, str2, str3, str4, arrayList2, i13, z12, readableNativeMap2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getOriginalMessage() {
            return this.originalMessage;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getComponentStack() {
            return this.componentStack;
        }

        @NotNull
        public final ArrayList<ParsedStackFrameImpl> component5() {
            return this.stack;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final int getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final boolean getIsFatal() {
            return this.isFatal;
        }

        @NotNull
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final ReadableNativeMap getExtraData() {
            return this.extraData;
        }

        @NotNull
        public final ParsedErrorImpl copy(@NotNull String message, @Nullable String originalMessage, @Nullable String name, @Nullable String componentStack, @NotNull ArrayList<ParsedStackFrameImpl> stack, int id2, boolean isFatal, @NotNull ReadableNativeMap extraData) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(stack, "stack");
            Intrinsics.checkNotNullParameter(extraData, "extraData");
            return new ParsedErrorImpl(message, originalMessage, name, componentStack, stack, id2, isFatal, extraData);
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler.ParsedError
        @Nullable
        public String getComponentStack() {
            return this.componentStack;
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler.ParsedError
        @NotNull
        public ReadableNativeMap getExtraData() {
            return this.extraData;
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler.ParsedError
        public int getId() {
            return this.id;
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler.ParsedError
        @NotNull
        public String getMessage() {
            return this.message;
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler.ParsedError
        @Nullable
        public String getName() {
            return this.name;
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler.ParsedError
        @Nullable
        public String getOriginalMessage() {
            return this.originalMessage;
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler.ParsedError
        @NotNull
        public ArrayList<ParsedStackFrameImpl> getStack() {
            return this.stack;
        }

        public int hashCode() {
            int iHashCode = this.message.hashCode() * 31;
            String str = this.originalMessage;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.name;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.componentStack;
            return ((((((((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.stack.hashCode()) * 31) + Integer.hashCode(this.id)) * 31) + Boolean.hashCode(this.isFatal)) * 31) + this.extraData.hashCode();
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler.ParsedError
        public boolean isFatal() {
            return this.isFatal;
        }

        @NotNull
        public String toString() {
            return "ParsedErrorImpl(message=" + this.message + ", originalMessage=" + this.originalMessage + ", name=" + this.name + ", componentStack=" + this.componentStack + ", stack=" + this.stack + ", id=" + this.id + ", isFatal=" + this.isFatal + ", extraData=" + this.extraData + ")";
        }
    }

    /* JADX INFO: compiled from: ReactJsExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0083\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ<\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001d"}, m90084d2 = {"Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedStackFrameImpl;", "Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedError$StackFrame;", "file", "", "methodName", "lineNumber", "", "column", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getFile", "()Ljava/lang/String;", "getMethodName", "getLineNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getColumn", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/facebook/react/interfaces/exceptionmanager/ReactJsExceptionHandler$ParsedStackFrameImpl;", "equals", "", "other", "", "hashCode", "toString", "ReactAndroid_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
    public static final /* data */ class ParsedStackFrameImpl implements ParsedError.StackFrame {

        @Nullable
        private final Integer column;

        @Nullable
        private final String file;

        @Nullable
        private final Integer lineNumber;

        @NotNull
        private final String methodName;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ParsedStackFrameImpl)) {
                return false;
            }
            ParsedStackFrameImpl parsedStackFrameImpl = (ParsedStackFrameImpl) other;
            return Intrinsics.areEqual(this.file, parsedStackFrameImpl.file) && Intrinsics.areEqual(this.methodName, parsedStackFrameImpl.methodName) && Intrinsics.areEqual(this.lineNumber, parsedStackFrameImpl.lineNumber) && Intrinsics.areEqual(this.column, parsedStackFrameImpl.column);
        }

        public ParsedStackFrameImpl(@Nullable String str, @NotNull String methodName, @Nullable Integer num, @Nullable Integer num2) {
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            this.file = str;
            this.methodName = methodName;
            this.lineNumber = num;
            this.column = num2;
        }

        public static /* synthetic */ ParsedStackFrameImpl copy$default(ParsedStackFrameImpl parsedStackFrameImpl, String str, String str2, Integer num, Integer num2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = parsedStackFrameImpl.file;
            }
            if ((i11 & 2) != 0) {
                str2 = parsedStackFrameImpl.methodName;
            }
            if ((i11 & 4) != 0) {
                num = parsedStackFrameImpl.lineNumber;
            }
            if ((i11 & 8) != 0) {
                num2 = parsedStackFrameImpl.column;
            }
            return parsedStackFrameImpl.copy(str, str2, num, num2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getFile() {
            return this.file;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getMethodName() {
            return this.methodName;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Integer getLineNumber() {
            return this.lineNumber;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Integer getColumn() {
            return this.column;
        }

        @NotNull
        public final ParsedStackFrameImpl copy(@Nullable String file, @NotNull String methodName, @Nullable Integer lineNumber, @Nullable Integer column) {
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            return new ParsedStackFrameImpl(file, methodName, lineNumber, column);
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler.ParsedError.StackFrame
        @Nullable
        public Integer getColumn() {
            return this.column;
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler.ParsedError.StackFrame
        @Nullable
        public String getFile() {
            return this.file;
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler.ParsedError.StackFrame
        @Nullable
        public Integer getLineNumber() {
            return this.lineNumber;
        }

        @Override // com.facebook.react.interfaces.exceptionmanager.ReactJsExceptionHandler.ParsedError.StackFrame
        @NotNull
        public String getMethodName() {
            return this.methodName;
        }

        public int hashCode() {
            String str = this.file;
            int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.methodName.hashCode()) * 31;
            Integer num = this.lineNumber;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.column;
            return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ParsedStackFrameImpl(file=" + this.file + ", methodName=" + this.methodName + ", lineNumber=" + this.lineNumber + ", column=" + this.column + ")";
        }
    }

    void reportJsException(@NotNull ParsedError errorMap);
}
