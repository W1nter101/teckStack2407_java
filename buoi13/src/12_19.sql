-- 12. Tìm nhân viên có mức lương cao nhất trong mỗi phòng ban
select e.name, e.salary, d.department_name from employees e left join departments d
on e.department_id = d.department_id
where (e.department_id,e.salary) in (
    select e2.department_id, MAX(salary)
    from employees e2
    group by e2.department_id
    );

-- 13. Tính mức lương trung bình của từng vị trí công việc, chỉ hiển thị các vị trí có lương trung bình lớn hơn 1500
select avg(e.salary) as luongTrungBinh, d.department_name from employees e join departments d
group by d.department_name
having luongTrungBinh > 1500;

-- 14. Lấy danh sách nhân viên và đồng nghiệp cùng phòng ban (không bao gồm chính họ)
select e.name as NhanVien, dongNghiep.name from employees e
inner join employees dongNghiep
on e.department_id = dongNghiep.department_id
where e.employee_id != dongNghiep.employee_id;

-- 15. Tính tổng số năm kinh nghiệm của mỗi phòng ban
select d.department_name, SUM(YEAR(CURRENT_DATE) - YEAR(hire_date)) as tongSoNamKinhNghiem from departments d
join employees e on d.department_id = e.department_id
group by d.department_name;

-- 16. Tìm nhân viên được tuyển dụng sớm nhất trong mỗi phòng ban, bao gồm cả tên và ngày tuyển dụng
select e.name, e.hire_date, d.department_name from employees e join departments d on e.department_id = d.department_id
where (d.department_id,e.hire_date) IN (
    select e2.department_id, MIN(e.hire_date)
    from employees e2
    group by e2.department_id
    );

-- 17. Tìm phòng ban có tổng lương lớn nhất và hiển thị tên nhân viên, lương và phòng ban đó
select e.name,e.salary,d.department_name from departments d join employees e on d.department_id = e.department_id
inner join (
    select department_name from departments d join employees e on d.department_id = e.department_id
    group by department_name
    order by sum(e.salary) desc
    limit 1
) as phongBanLuongCao
on phongBanLuongCao.department_name = d.department_name
group by e.name, e.salary, d.department_name;

-- 18. Phân nhóm nhân viên theo bậc lương (ví dụ: < 1500, 1500-2000, > 2000) và tính tổng số nhân viên trong từng nhóm/-strong/-heart:>:o:-((:-h Sử dụng CASE và GROUP BY:

-- 19. Tìm nhân viên có tổng số lương cao nhất trong tất cả các phòng ban (bao gồm cả tên phòng ban)
select e.name,e.salary,d.department_name from employees e join departments d on e.department_id = d.department_id
group by e.name, e.salary, d.department_name
order by e.salary desc
limit 1;
-- 20. Tìm tên nhân viên có lương cao hơn mức lương trung bình của phòng ban mà họ làm việc
select e.name,e.salary,d.department_name from employees e join departments d on e.department_id = d.department_id
join (
      select d.department_name, avg(e.salary) as luongTB
      from employees e
      join departments d on e.department_id = d.department_id
      group by d.department_name
      ) as luongTrungBinhMoiPhongBan
on e.salary > luongTB