# Credit Card Validator

A Java program that identifies credit card networks and classifies account tiers based on card number structure.

---

## Purpose

Practice core Java concepts through a real-world scenario:
- Static methods and method overloading
- String manipulation (`substring`, `startsWith`, `length`)
- Conditional logic with `if-else` and `switch-case`
- Input validation and exception handling

---

## Program Design

### Methods

| Method | Input | Output | Description |
|--------|-------|--------|-------------|
| `digits(int x)` | `int` | `int` | Returns the number of digits in an integer |
| `identifyIssuer(String)` | `String` | `String` | Identifies card network by IIN prefix |
| `classifyAccount(int)` | `int` | `String` | Classifies account tier by digit count |
| `classifyAccount(String)` | `String` | `String` | Overload: classifies by card number string length |

---

## IIN Detection Pattern

`identifyIssuer()` uses the **longest-prefix-first** strategy:

> Check 4-digit prefixes → 3-digit → 2-digit → 1-digit

This prevents shorter prefixes from incorrectly matching longer, more specific ones.

**Example conflict without priority ordering:**

| Card number | 2-digit prefix | 4-digit prefix |
|-------------|---------------|---------------|
| 6011xxxxxxxx | 60 → Maestro ❌ | **6011 → Discover ✅** |

By checking `6011` before `60`, the correct network is returned.

### Supported Networks

| Network | IIN Prefix |
|---------|-----------|
| Visa | 4 |
| Mastercard | 51–55, 2221–2720 |
| American Express | 34, 37 |
| Discover | 6011, 644–649, 65 |
| JCB | 3528–3589 |
| Diners Club Intl | 300–305, 36, 38, 39 |
| China UnionPay | 62, 81 |
| China T-Union | 31 |
| Maestro | 50, 56–69 |
| MIR | 2200–2204 |
| RuPay | 508, 60, 82 |
| UATP | 1 |

---

## Design Patterns Applied

### Method Overloading
`classifyAccount` has two versions accepting different parameter types (`int` and `String`), allowing the same method name to work with both legacy account numbers and real card number strings.

### Guard Clause
Early `return` for invalid input (`null`, empty, negative) keeps the main logic clean and avoids deep nesting.

```java
if (cardNumber == null || cardNumber.isEmpty()) return "Unknown";
```

---

## Why `String` for Card Numbers?

Real card numbers have 13–19 digits, which exceeds `int` capacity (~10 digits). Using `String`:
- Avoids integer overflow
- Preserves leading zeros
- Makes prefix extraction simple via `substring()`

---

## Sample Output

```
Testing : 4111111111111111 -> Visa | Invalid
Testing : 5123456789012345 -> Mastercard | Invalid
Testing : 2221000000000009 -> Mastercard | Invalid
Testing : 378282246310005 -> American Express | Invalid
Testing : 6011111111111117 -> Discover | Invalid
Testing : 3530111333300000 -> JCB | Invalid
Testing : 30569309025904 -> Diners Club Intl | Invalid
Testing : 99 -> Unknown | Invalid
```
