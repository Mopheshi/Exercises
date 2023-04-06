import platform
import psutil

# Credits:  ChatGPT, Mopheshi

print("=" * 20, "System Information", "=" * 20)
print()

# Operating system name and version
print(f"Operating System\t:\t{platform.system()} {platform.release()}")

# CPU information
cpu_count = psutil.cpu_count(logical=False)
cpu_percent = psutil.cpu_percent()
cpu_freq = psutil.cpu_freq()
print(f"CPU\t\t\t\t\t:\t{cpu_count}x {cpu_freq.max:.1f}MHz @ {cpu_percent}%")

# Memory information
mem = psutil.virtual_memory()
mem_total = mem.total / (1024 * 1024)
mem_avail = mem.available / (1024 * 1024)
print(f"Memory:\t\t\t\t:\t{mem_avail:.1f}MB free / {mem_total:.1f}MB total")

# Disk information
disk = psutil.disk_usage('/')
disk_total = disk.total / (1024 * 1024 * 1024)
disk_avail = disk.free / (1024 * 1024 * 1024)
print(f"Disk\t\t\t\t:\t{disk_avail:.1f}GB free / {disk_total:.1f}GB total")

print()
print("=" * 20, "System Information", "=" * 20)
