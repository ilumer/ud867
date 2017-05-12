#### gradle 中的 `task` 的 `type` 属性代表的是什么
// 目前我认为是类似于继承
为什么在 `type： Copy`的情况下无法输出
http://stackoverflow.com/questions/41002325/gradle-dolast-dofirst-behavior-in-copy-task
#### `doLast` 和 `doFirst` 的区别
 `Task` 是由一系列的 `action` 对象组成的，当 `Task` 执行的时候，一系列的 `action` 依次执行，这里的 `doLast` 和 `doFirst` 代表的是字面意思
