```kotlin
fun processData(data: String?): Int {
    return data?.length ?: -1 // Potential NullPointerException if data is null
}
```