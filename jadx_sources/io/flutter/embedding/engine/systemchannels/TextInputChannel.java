package io.flutter.embedding.engine.systemchannels;

import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.autofill.HintConstants;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.messaging.Constants;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.JSONMethodCodec;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.editing.TextEditingDelta;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes23.dex */
public class TextInputChannel {
    private static final String TAG = "TextInputChannel";

    @NonNull
    public final MethodChannel channel;

    @NonNull
    @VisibleForTesting
    final MethodChannel.MethodCallHandler parsingMethodHandler;

    @Nullable
    private TextInputMethodHandler textInputMethodHandler;

    /* JADX INFO: loaded from: classes60.dex */
    public static class Configuration {

        @Nullable
        public final String actionLabel;
        public final boolean autocorrect;

        @Nullable
        public final Autofill autofill;

        @Nullable
        public final String[] contentCommitMimeTypes;
        public final boolean enableDeltaModel;
        public final boolean enableIMEPersonalizedLearning;
        public final boolean enableSuggestions;

        @Nullable
        public final Configuration[] fields;

        @Nullable
        public final Integer inputAction;

        @NonNull
        public final InputType inputType;
        public final boolean obscureText;

        @NonNull
        public final TextCapitalization textCapitalization;

        public static class Autofill {
            public final TextEditState editState;
            public final String hintText;
            public final String[] hints;
            public final String uniqueIdentifier;

            @NonNull
            public static Autofill fromJson(@NonNull JSONObject jSONObject) throws JSONException, NoSuchFieldException {
                String string = jSONObject.getString("uniqueIdentifier");
                JSONArray jSONArray = jSONObject.getJSONArray("hints");
                String string2 = jSONObject.isNull("hintText") ? null : jSONObject.getString("hintText");
                JSONObject jSONObject2 = jSONObject.getJSONObject("editingValue");
                String[] strArr = new String[jSONArray.length()];
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    strArr[i11] = translateAutofillHint(jSONArray.getString(i11));
                }
                return new Autofill(string, strArr, string2, TextEditState.fromJson(jSONObject2));
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code duplicated, block: B:7:0x002d  */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @NonNull
            private static String translateAutofillHint(@NonNull String str) {
                byte b11 = 26;
                if (Build.VERSION.SDK_INT < 26) {
                    return str;
                }
                str.getClass();
                switch (str.hashCode()) {
                    case -2058889126:
                        if (!str.equals("birthdayYear")) {
                            b11 = -1;
                        } else {
                            b11 = 0;
                        }
                        break;
                    case -1917283616:
                        if (!str.equals("oneTimeCode")) {
                            b11 = -1;
                        } else {
                            b11 = 1;
                        }
                        break;
                    case -1844815832:
                        if (!str.equals(HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_MONTH)) {
                            b11 = -1;
                        } else {
                            b11 = 2;
                        }
                        break;
                    case -1825589953:
                        if (!str.equals("telephoneNumberNational")) {
                            b11 = -1;
                        } else {
                            b11 = 3;
                        }
                        break;
                    case -1821235109:
                        if (!str.equals(HintConstants.AUTOFILL_HINT_NEW_PASSWORD)) {
                            b11 = -1;
                        } else {
                            b11 = 4;
                        }
                        break;
                    case -1757573738:
                        if (!str.equals(HintConstants.AUTOFILL_HINT_CREDIT_CARD_SECURITY_CODE)) {
                            b11 = -1;
                        } else {
                            b11 = 5;
                        }
                        break;
                    case -1682373820:
                        if (!str.equals(HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DAY)) {
                            b11 = -1;
                        } else {
                            b11 = 6;
                        }
                        break;
                    case -1658955742:
                        if (!str.equals("fullStreetAddress")) {
                            b11 = -1;
                        } else {
                            b11 = 7;
                        }
                        break;
                    case -1567118045:
                        if (!str.equals("telephoneNumberDevice")) {
                            b11 = -1;
                        } else {
                            b11 = 8;
                        }
                        break;
                    case -1476752575:
                        if (!str.equals("countryName")) {
                            b11 = -1;
                        } else {
                            b11 = 9;
                        }
                        break;
                    case -1413737489:
                        if (!str.equals("middleInitial")) {
                            b11 = -1;
                        } else {
                            b11 = 10;
                        }
                        break;
                    case -1377792129:
                        if (!str.equals("addressCity")) {
                            b11 = -1;
                        } else {
                            b11 = 11;
                        }
                        break;
                    case -1249512767:
                        if (!str.equals(HintConstants.AUTOFILL_HINT_GENDER)) {
                            b11 = -1;
                        } else {
                            b11 = 12;
                        }
                        break;
                    case -1186060294:
                        if (!str.equals("postalAddressExtendedPostalCode")) {
                            b11 = -1;
                        } else {
                            b11 = 13;
                        }
                        break;
                    case -1151034798:
                        if (!str.equals(HintConstants.AUTOFILL_HINT_CREDIT_CARD_NUMBER)) {
                            b11 = -1;
                        } else {
                            b11 = 14;
                        }
                        break;
                    case -835992323:
                        if (!str.equals("namePrefix")) {
                            b11 = -1;
                        } else {
                            b11 = 15;
                        }
                        break;
                    case -818219584:
                        if (!str.equals("middleName")) {
                            b11 = -1;
                        } else {
                            b11 = 16;
                        }
                        break;
                    case -747304516:
                        if (!str.equals("nameSuffix")) {
                            b11 = -1;
                        } else {
                            b11 = 17;
                        }
                        break;
                    case -613980922:
                        if (!str.equals(HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DATE)) {
                            b11 = -1;
                        } else {
                            b11 = 18;
                        }
                        break;
                    case -613352043:
                        if (!str.equals(HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_YEAR)) {
                            b11 = -1;
                        } else {
                            b11 = 19;
                        }
                        break;
                    case -549230602:
                        if (!str.equals("telephoneNumberCountryCode")) {
                            b11 = -1;
                        } else {
                            b11 = 20;
                        }
                        break;
                    case -265713450:
                        if (!str.equals("username")) {
                            b11 = -1;
                        } else {
                            b11 = 21;
                        }
                        break;
                    case 3373707:
                        if (!str.equals("name")) {
                            b11 = -1;
                        } else {
                            b11 = 22;
                        }
                        break;
                    case 96619420:
                        if (!str.equals("email")) {
                            b11 = -1;
                        } else {
                            b11 = 23;
                        }
                        break;
                    case 253202685:
                        if (!str.equals("addressState")) {
                            b11 = -1;
                        } else {
                            b11 = 24;
                        }
                        break;
                    case 588174851:
                        if (!str.equals("birthdayMonth")) {
                            b11 = -1;
                        } else {
                            b11 = 25;
                        }
                        break;
                    case 798554127:
                        if (!str.equals("familyName")) {
                            b11 = -1;
                        }
                        break;
                    case 892233837:
                        if (!str.equals("telephoneNumber")) {
                            b11 = -1;
                        } else {
                            b11 = 27;
                        }
                        break;
                    case 991032982:
                        if (!str.equals(HintConstants.AUTOFILL_HINT_NEW_USERNAME)) {
                            b11 = -1;
                        } else {
                            b11 = 28;
                        }
                        break;
                    case 1069376125:
                        if (!str.equals("birthday")) {
                            b11 = -1;
                        } else {
                            b11 = 29;
                        }
                        break;
                    case 1216985755:
                        if (!str.equals("password")) {
                            b11 = -1;
                        } else {
                            b11 = 30;
                        }
                        break;
                    case 1469046696:
                        if (!str.equals("givenName")) {
                            b11 = -1;
                        } else {
                            b11 = 31;
                        }
                        break;
                    case 1662667945:
                        if (!str.equals(HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS)) {
                            b11 = -1;
                        } else {
                            b11 = 32;
                        }
                        break;
                    case 1921869058:
                        if (!str.equals("postalAddressExtended")) {
                            b11 = -1;
                        } else {
                            b11 = BuiltinOptions.ExpOptions;
                        }
                        break;
                    case 2011152728:
                        if (!str.equals(HintConstants.AUTOFILL_HINT_POSTAL_CODE)) {
                            b11 = -1;
                        } else {
                            b11 = BuiltinOptions.TopKV2Options;
                        }
                        break;
                    case 2011773919:
                        if (!str.equals("birthdayDay")) {
                            b11 = -1;
                        } else {
                            b11 = BuiltinOptions.SplitOptions;
                        }
                        break;
                    default:
                        b11 = -1;
                        break;
                }
                switch (b11) {
                    case 0:
                        return HintConstants.AUTOFILL_HINT_BIRTH_DATE_YEAR;
                    case 1:
                        return HintConstants.AUTOFILL_HINT_SMS_OTP;
                    case 2:
                        return HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_MONTH;
                    case 3:
                        return HintConstants.AUTOFILL_HINT_PHONE_NATIONAL;
                    case 4:
                        return HintConstants.AUTOFILL_HINT_NEW_PASSWORD;
                    case 5:
                        return HintConstants.AUTOFILL_HINT_CREDIT_CARD_SECURITY_CODE;
                    case 6:
                        return HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DAY;
                    case 7:
                        return HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_STREET_ADDRESS;
                    case 8:
                        return HintConstants.AUTOFILL_HINT_PHONE_NUMBER_DEVICE;
                    case 9:
                        return HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_COUNTRY;
                    case 10:
                        return HintConstants.AUTOFILL_HINT_PERSON_NAME_MIDDLE_INITIAL;
                    case 11:
                        return HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_LOCALITY;
                    case 12:
                        return HintConstants.AUTOFILL_HINT_GENDER;
                    case 13:
                        return HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_EXTENDED_POSTAL_CODE;
                    case 14:
                        return HintConstants.AUTOFILL_HINT_CREDIT_CARD_NUMBER;
                    case 15:
                        return HintConstants.AUTOFILL_HINT_PERSON_NAME_PREFIX;
                    case 16:
                        return HintConstants.AUTOFILL_HINT_PERSON_NAME_MIDDLE;
                    case 17:
                        return HintConstants.AUTOFILL_HINT_PERSON_NAME_SUFFIX;
                    case 18:
                        return HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DATE;
                    case 19:
                        return HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_YEAR;
                    case 20:
                        return HintConstants.AUTOFILL_HINT_PHONE_COUNTRY_CODE;
                    case 21:
                        return "username";
                    case 22:
                        return HintConstants.AUTOFILL_HINT_PERSON_NAME;
                    case 23:
                        return HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS;
                    case 24:
                        return HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_REGION;
                    case 25:
                        return HintConstants.AUTOFILL_HINT_BIRTH_DATE_MONTH;
                    case 26:
                        return HintConstants.AUTOFILL_HINT_PERSON_NAME_FAMILY;
                    case 27:
                        return HintConstants.AUTOFILL_HINT_PHONE_NUMBER;
                    case 28:
                        return HintConstants.AUTOFILL_HINT_NEW_USERNAME;
                    case 29:
                        return HintConstants.AUTOFILL_HINT_BIRTH_DATE_FULL;
                    case 30:
                        return "password";
                    case 31:
                        return HintConstants.AUTOFILL_HINT_PERSON_NAME_GIVEN;
                    case 32:
                        return HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS;
                    case 33:
                        return HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS_EXTENDED_ADDRESS;
                    case 34:
                        return HintConstants.AUTOFILL_HINT_POSTAL_CODE;
                    case 35:
                        return HintConstants.AUTOFILL_HINT_BIRTH_DATE_DAY;
                    default:
                        return str;
                }
            }

            public Autofill(@NonNull String str, @NonNull String[] strArr, @Nullable String str2, @NonNull TextEditState textEditState) {
                this.uniqueIdentifier = str;
                this.hints = strArr;
                this.hintText = str2;
                this.editState = textEditState;
            }
        }

        @NonNull
        private static Integer inputActionFromTextInputAction(@NonNull String str) {
            str.getClass();
            switch (str) {
                case "TextInputAction.unspecified":
                    return 0;
                case "TextInputAction.done":
                    return 6;
                case "TextInputAction.next":
                    return 5;
                case "TextInputAction.none":
                    return 1;
                case "TextInputAction.send":
                    return 4;
                case "TextInputAction.search":
                    return 3;
                case "TextInputAction.go":
                    return 2;
                case "TextInputAction.newline":
                    return 1;
                case "TextInputAction.previous":
                    return 7;
                default:
                    return 0;
            }
        }

        @NonNull
        public static Configuration fromJson(@NonNull JSONObject jSONObject) throws JSONException, NoSuchFieldException {
            Configuration[] configurationArr;
            String string = jSONObject.getString("inputAction");
            if (string == null) {
                throw new JSONException("Configuration JSON missing 'inputAction' property.");
            }
            if (jSONObject.isNull("fields")) {
                configurationArr = null;
            } else {
                JSONArray jSONArray = jSONObject.getJSONArray("fields");
                int length = jSONArray.length();
                Configuration[] configurationArr2 = new Configuration[length];
                for (int i11 = 0; i11 < length; i11++) {
                    configurationArr2[i11] = fromJson(jSONArray.getJSONObject(i11));
                }
                configurationArr = configurationArr2;
            }
            Integer numInputActionFromTextInputAction = inputActionFromTextInputAction(string);
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray2 = jSONObject.isNull("contentCommitMimeTypes") ? null : jSONObject.getJSONArray("contentCommitMimeTypes");
            if (jSONArray2 != null) {
                for (int i12 = 0; i12 < jSONArray2.length(); i12++) {
                    arrayList.add(jSONArray2.optString(i12));
                }
            }
            return new Configuration(jSONObject.optBoolean("obscureText"), jSONObject.optBoolean("autocorrect", true), jSONObject.optBoolean("enableSuggestions"), jSONObject.optBoolean("enableIMEPersonalizedLearning"), jSONObject.optBoolean("enableDeltaModel"), TextCapitalization.fromValue(jSONObject.getString("textCapitalization")), InputType.fromJson(jSONObject.getJSONObject("inputType")), numInputActionFromTextInputAction, jSONObject.isNull("actionLabel") ? null : jSONObject.getString("actionLabel"), jSONObject.isNull("autofill") ? null : Autofill.fromJson(jSONObject.getJSONObject("autofill")), (String[]) arrayList.toArray(new String[arrayList.size()]), configurationArr);
        }

        public Configuration(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, @NonNull TextCapitalization textCapitalization, @NonNull InputType inputType, @Nullable Integer num, @Nullable String str, @Nullable Autofill autofill, @Nullable String[] strArr, @Nullable Configuration[] configurationArr) {
            this.obscureText = z11;
            this.autocorrect = z12;
            this.enableSuggestions = z13;
            this.enableIMEPersonalizedLearning = z14;
            this.enableDeltaModel = z15;
            this.textCapitalization = textCapitalization;
            this.inputType = inputType;
            this.inputAction = num;
            this.actionLabel = str;
            this.autofill = autofill;
            this.contentCommitMimeTypes = strArr;
            this.fields = configurationArr;
        }
    }

    /* JADX INFO: loaded from: classes60.dex */
    public static class InputType {
        public final boolean isDecimal;
        public final boolean isSigned;

        @NonNull
        public final TextInputType type;

        @NonNull
        public static InputType fromJson(@NonNull JSONObject jSONObject) throws JSONException, NoSuchFieldException {
            return new InputType(TextInputType.fromValue(jSONObject.getString("name")), jSONObject.optBoolean("signed", false), jSONObject.optBoolean("decimal", false));
        }

        public InputType(@NonNull TextInputType textInputType, boolean z11, boolean z12) {
            this.type = textInputType;
            this.isSigned = z11;
            this.isDecimal = z12;
        }
    }

    /* JADX INFO: loaded from: classes60.dex */
    public static class TextEditState {
        public final int composingEnd;
        public final int composingStart;
        public final int selectionEnd;
        public final int selectionStart;

        @NonNull
        public final String text;

        @NonNull
        public static TextEditState fromJson(@NonNull JSONObject jSONObject) throws JSONException {
            return new TextEditState(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
        }

        public boolean hasComposing() {
            int i11 = this.composingStart;
            return i11 >= 0 && this.composingEnd > i11;
        }

        public boolean hasSelection() {
            return this.selectionStart >= 0;
        }

        public TextEditState(@NonNull String str, int i11, int i12, int i13, int i14) throws IndexOutOfBoundsException {
            if ((i11 == -1 && i12 == -1) || (i11 >= 0 && i12 >= 0)) {
                if ((i13 == -1 && i14 == -1) || (i13 >= 0 && i13 <= i14)) {
                    if (i14 <= str.length()) {
                        if (i11 <= str.length()) {
                            if (i12 <= str.length()) {
                                this.text = str;
                                this.selectionStart = i11;
                                this.selectionEnd = i12;
                                this.composingStart = i13;
                                this.composingEnd = i14;
                                return;
                            }
                            throw new IndexOutOfBoundsException("invalid selection end: " + String.valueOf(i12));
                        }
                        throw new IndexOutOfBoundsException("invalid selection start: " + String.valueOf(i11));
                    }
                    throw new IndexOutOfBoundsException("invalid composing start: " + String.valueOf(i13));
                }
                throw new IndexOutOfBoundsException("invalid composing range: (" + String.valueOf(i13) + ", " + String.valueOf(i14) + ")");
            }
            throw new IndexOutOfBoundsException("invalid selection: (" + String.valueOf(i11) + ", " + String.valueOf(i12) + ")");
        }
    }

    public interface TextInputMethodHandler {
        void clearClient();

        void finishAutofillContext(boolean z11);

        void hide();

        void requestAutofill();

        void sendAppPrivateCommand(@NonNull String str, @NonNull Bundle bundle);

        void setClient(int i11, @NonNull Configuration configuration);

        void setEditableSizeAndTransform(double d11, double d12, @NonNull double[] dArr);

        void setEditingState(@NonNull TextEditState textEditState);

        void setPlatformViewClient(int i11, boolean z11);

        void show();
    }

    /* JADX INFO: loaded from: classes60.dex */
    public enum TextCapitalization {
        CHARACTERS("TextCapitalization.characters"),
        WORDS("TextCapitalization.words"),
        SENTENCES("TextCapitalization.sentences"),
        NONE("TextCapitalization.none");


        @NonNull
        private final String encodedName;

        TextCapitalization(String str) {
            this.encodedName = str;
        }

        public static TextCapitalization fromValue(@NonNull String str) throws NoSuchFieldException {
            for (TextCapitalization textCapitalization : values()) {
                if (textCapitalization.encodedName.equals(str)) {
                    return textCapitalization;
                }
            }
            throw new NoSuchFieldException("No such TextCapitalization: " + str);
        }
    }

    /* JADX INFO: loaded from: classes60.dex */
    public enum TextInputType {
        TEXT("TextInputType.text"),
        DATETIME("TextInputType.datetime"),
        NAME("TextInputType.name"),
        POSTAL_ADDRESS("TextInputType.address"),
        NUMBER("TextInputType.number"),
        PHONE("TextInputType.phone"),
        MULTILINE("TextInputType.multiline"),
        EMAIL_ADDRESS("TextInputType.emailAddress"),
        URL("TextInputType.url"),
        VISIBLE_PASSWORD("TextInputType.visiblePassword"),
        NONE("TextInputType.none"),
        WEB_SEARCH("TextInputType.webSearch"),
        TWITTER("TextInputType.twitter");


        @NonNull
        private final String encodedName;

        TextInputType(String str) {
            this.encodedName = str;
        }

        public static TextInputType fromValue(@NonNull String str) throws NoSuchFieldException {
            for (TextInputType textInputType : values()) {
                if (textInputType.encodedName.equals(str)) {
                    return textInputType;
                }
            }
            throw new NoSuchFieldException("No such TextInputType: " + str);
        }
    }

    private static HashMap<Object, Object> createEditingDeltaJSON(ArrayList<TextEditingDelta> arrayList) {
        HashMap<Object, Object> map = new HashMap<>();
        JSONArray jSONArray = new JSONArray();
        Iterator<TextEditingDelta> it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().toJSON());
        }
        map.put("deltas", jSONArray);
        return map;
    }

    private static HashMap<Object, Object> createEditingStateJSON(String str, int i11, int i12, int i13, int i14) {
        HashMap<Object, Object> map = new HashMap<>();
        map.put("text", str);
        map.put("selectionBase", Integer.valueOf(i11));
        map.put("selectionExtent", Integer.valueOf(i12));
        map.put("composingBase", Integer.valueOf(i13));
        map.put("composingExtent", Integer.valueOf(i14));
        return map;
    }

    public void commitContent(int i11, Map<String, Object> map) {
        Log.m87481v(TAG, "Sending 'commitContent' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i11), "TextInputAction.commitContent", map));
    }

    public void done(int i11) {
        Log.m87481v(TAG, "Sending 'done' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i11), "TextInputAction.done"));
    }

    /* JADX INFO: renamed from: go */
    public void m87520go(int i11) {
        Log.m87481v(TAG, "Sending 'go' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i11), "TextInputAction.go"));
    }

    public void newline(int i11) {
        Log.m87481v(TAG, "Sending 'newline' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i11), "TextInputAction.newline"));
    }

    public void next(int i11) {
        Log.m87481v(TAG, "Sending 'next' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i11), "TextInputAction.next"));
    }

    public void performPrivateCommand(int i11, @NonNull String str, @NonNull Bundle bundle) {
        HashMap map = new HashMap();
        map.put(TUIConstants.TIMPush.NOTIFICATION.ACTION, str);
        if (bundle != null) {
            HashMap map2 = new HashMap();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj instanceof byte[]) {
                    map2.put(str2, bundle.getByteArray(str2));
                } else if (obj instanceof Byte) {
                    map2.put(str2, Byte.valueOf(bundle.getByte(str2)));
                } else if (obj instanceof char[]) {
                    map2.put(str2, bundle.getCharArray(str2));
                } else if (obj instanceof Character) {
                    map2.put(str2, Character.valueOf(bundle.getChar(str2)));
                } else if (obj instanceof CharSequence[]) {
                    map2.put(str2, bundle.getCharSequenceArray(str2));
                } else if (obj instanceof CharSequence) {
                    map2.put(str2, bundle.getCharSequence(str2));
                } else if (obj instanceof float[]) {
                    map2.put(str2, bundle.getFloatArray(str2));
                } else if (obj instanceof Float) {
                    map2.put(str2, Float.valueOf(bundle.getFloat(str2)));
                }
            }
            map.put("data", map2);
        }
        this.channel.invokeMethod("TextInputClient.performPrivateCommand", Arrays.asList(Integer.valueOf(i11), map));
    }

    public void previous(int i11) {
        Log.m87481v(TAG, "Sending 'previous' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i11), "TextInputAction.previous"));
    }

    public void requestExistingInputState() {
        this.channel.invokeMethod("TextInputClient.requestExistingInputState", null);
    }

    public void search(int i11) {
        Log.m87481v(TAG, "Sending 'search' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i11), "TextInputAction.search"));
    }

    public void send(int i11) {
        Log.m87481v(TAG, "Sending 'send' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i11), "TextInputAction.send"));
    }

    public void setTextInputMethodHandler(@Nullable TextInputMethodHandler textInputMethodHandler) {
        this.textInputMethodHandler = textInputMethodHandler;
    }

    public void unspecifiedAction(int i11) {
        Log.m87481v(TAG, "Sending 'unspecified' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(Integer.valueOf(i11), "TextInputAction.unspecified"));
    }

    public void updateEditingState(int i11, @NonNull String str, int i12, int i13, int i14, int i15) {
        Log.m87481v(TAG, "Sending message to update editing state: \nText: " + str + "\nSelection start: " + i12 + "\nSelection end: " + i13 + "\nComposing start: " + i14 + "\nComposing end: " + i15);
        this.channel.invokeMethod("TextInputClient.updateEditingState", Arrays.asList(Integer.valueOf(i11), createEditingStateJSON(str, i12, i13, i14, i15)));
    }

    public void updateEditingStateWithDeltas(int i11, @NonNull ArrayList<TextEditingDelta> arrayList) {
        Log.m87481v(TAG, "Sending message to update editing state with deltas: \nNumber of deltas: " + arrayList.size());
        this.channel.invokeMethod("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(Integer.valueOf(i11), createEditingDeltaJSON(arrayList)));
    }

    public void updateEditingStateWithTag(int i11, @NonNull HashMap<String, TextEditState> map) {
        Log.m87481v(TAG, "Sending message to update editing state for " + String.valueOf(map.size()) + " field(s).");
        HashMap map2 = new HashMap();
        for (Map.Entry<String, TextEditState> entry : map.entrySet()) {
            TextEditState value = entry.getValue();
            map2.put(entry.getKey(), createEditingStateJSON(value.text, value.selectionStart, value.selectionEnd, -1, -1));
        }
        this.channel.invokeMethod("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(i11), map2));
    }

    public TextInputChannel(@NonNull DartExecutor dartExecutor) {
        MethodChannel.MethodCallHandler methodCallHandler = new MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.TextInputChannel.1
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public void onMethodCall(@NonNull MethodCall methodCall, @NonNull MethodChannel.Result result) {
                Bundle bundle;
                if (TextInputChannel.this.textInputMethodHandler == null) {
                    return;
                }
                String str = methodCall.method;
                Object obj = methodCall.arguments;
                Log.m87481v(TextInputChannel.TAG, "Received '" + str + "' message.");
                str.getClass();
                switch (str) {
                    case "TextInput.setPlatformViewClient":
                        try {
                            JSONObject jSONObject = (JSONObject) obj;
                            TextInputChannel.this.textInputMethodHandler.setPlatformViewClient(jSONObject.getInt("platformViewId"), jSONObject.optBoolean("usesVirtualDisplay", false));
                            result.success(null);
                            break;
                        } catch (JSONException e11) {
                            result.error(Constants.IPC_BUNDLE_KEY_SEND_ERROR, e11.getMessage(), null);
                            return;
                        }
                        break;
                    case "TextInput.setEditingState":
                        try {
                            TextInputChannel.this.textInputMethodHandler.setEditingState(TextEditState.fromJson((JSONObject) obj));
                            result.success(null);
                            break;
                        } catch (JSONException e12) {
                            result.error(Constants.IPC_BUNDLE_KEY_SEND_ERROR, e12.getMessage(), null);
                            return;
                        }
                        break;
                    case "TextInput.setClient":
                        try {
                            JSONArray jSONArray = (JSONArray) obj;
                            TextInputChannel.this.textInputMethodHandler.setClient(jSONArray.getInt(0), Configuration.fromJson(jSONArray.getJSONObject(1)));
                            result.success(null);
                            break;
                        } catch (NoSuchFieldException | JSONException e13) {
                            result.error(Constants.IPC_BUNDLE_KEY_SEND_ERROR, e13.getMessage(), null);
                            return;
                        }
                        break;
                    case "TextInput.hide":
                        TextInputChannel.this.textInputMethodHandler.hide();
                        result.success(null);
                        break;
                    case "TextInput.show":
                        TextInputChannel.this.textInputMethodHandler.show();
                        result.success(null);
                        break;
                    case "TextInput.sendAppPrivateCommand":
                        try {
                            JSONObject jSONObject2 = (JSONObject) obj;
                            String string = jSONObject2.getString(TUIConstants.TIMPush.NOTIFICATION.ACTION);
                            String string2 = jSONObject2.getString("data");
                            if (string2 == null || string2.isEmpty()) {
                                bundle = null;
                            } else {
                                bundle = new Bundle();
                                bundle.putString("data", string2);
                            }
                            TextInputChannel.this.textInputMethodHandler.sendAppPrivateCommand(string, bundle);
                            result.success(null);
                            break;
                        } catch (JSONException e14) {
                            result.error(Constants.IPC_BUNDLE_KEY_SEND_ERROR, e14.getMessage(), null);
                            return;
                        }
                        break;
                    case "TextInput.setEditableSizeAndTransform":
                        try {
                            JSONObject jSONObject3 = (JSONObject) obj;
                            double d11 = jSONObject3.getDouble("width");
                            double d12 = jSONObject3.getDouble("height");
                            JSONArray jSONArray2 = jSONObject3.getJSONArray(ViewProps.TRANSFORM);
                            double[] dArr = new double[16];
                            for (int i11 = 0; i11 < 16; i11++) {
                                dArr[i11] = jSONArray2.getDouble(i11);
                            }
                            TextInputChannel.this.textInputMethodHandler.setEditableSizeAndTransform(d11, d12, dArr);
                            result.success(null);
                            break;
                        } catch (JSONException e15) {
                            result.error(Constants.IPC_BUNDLE_KEY_SEND_ERROR, e15.getMessage(), null);
                            return;
                        }
                        break;
                    case "TextInput.finishAutofillContext":
                        TextInputChannel.this.textInputMethodHandler.finishAutofillContext(((Boolean) obj).booleanValue());
                        result.success(null);
                        break;
                    case "TextInput.clearClient":
                        TextInputChannel.this.textInputMethodHandler.clearClient();
                        result.success(null);
                        break;
                    case "TextInput.requestAutofill":
                        TextInputChannel.this.textInputMethodHandler.requestAutofill();
                        result.success(null);
                        break;
                    default:
                        result.notImplemented();
                        break;
                }
            }
        };
        this.parsingMethodHandler = methodCallHandler;
        MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/textinput", JSONMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(methodCallHandler);
    }
}
