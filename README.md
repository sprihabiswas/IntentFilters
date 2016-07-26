# IntentFilters
Shows how to make activities in your app open for use by other apps by defining intent filters that declare the implicit intents your app accepts (Part of the series - Mastering Android)

# Note
* In order to receive implicit intents, you must include the CATEGORY_DEFAULT category in the intent filter. The methods startActivity() and startActivityForResult() treat all intents as if they declared the CATEGORY_DEFAULT category. If you do not declare it in your intent filter, no implicit intents will resolve to your activity.

* You must always specify a result code with the result. Generally, it's either RESULT_OK or RESULT_CANCELED. You can then provide additional data with an Intent, as necessary.

* The result is set to RESULT_CANCELED by default. So, if the user presses the Back button before completing the action and before you set the result, the original activity receives the "canceled" result.

* There's no need to check whether your activity was started with startActivity() or startActivityForResult(). Simply call setResult() if the intent that started your activity might expect a result. If the originating activity had called startActivityForResult(), then the system delivers it the result you supply to setResult(); otherwise, the result is ignored.
