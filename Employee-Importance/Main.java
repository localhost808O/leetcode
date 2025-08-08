class Solution {

    private Map<Integer, Employee> employees;
    private int totalSum;
    private Employee getEmployeeById(int id) {
        return employees.get(id);
        //return employees.stream().filter(e -> e.id == id ).findFirst().orElse(null);
    }

    private void f(Employee e){
        if (e.subordinates.isEmpty()) {
            return;
        }
        for (Integer id : e.subordinates) {
            Employee empl = getEmployeeById(id);
            totalSum += empl.importance;
            f(empl);
        }
    }

    public int getImportance(List<Employee> employees, int id) {
        this.employees = new HashMap<>();
        for (Employee e : employees) {
            this.employees.put(e.id, e);
        }
        Employee empl = getEmployeeById(id);
        this.totalSum = empl.importance;
        f(empl);
        return this.totalSum;

    }
}
