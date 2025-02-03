```kotlin
fun processData(data: String?): Int {
    return data?.length ?: 0 // Returns 0 if data is null instead of throwing an exception
}

alternatively

fun processData(data: String?): Int = data?.length ?: 0 //More concise approach using elvis operator
```